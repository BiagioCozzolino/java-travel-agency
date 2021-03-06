package jana60;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Vacanza {

	// Attributi
	private String destinazione;
	private int giornoInizio, meseInizio, annoInizio, giornoFine, meseFine, annoFine;
	LocalDate dataInizio;
	LocalDate dataFine;

	public Vacanza(String destinazione, int giornoInizio, int meseInizio, int annoInizio, int giornoFine, int meseFine,
			int annoFine) throws Exception {
		this.destinazione = destinazione;
		this.giornoInizio = giornoInizio;
		this.meseInizio = meseInizio;
		this.annoInizio = annoInizio;
		this.giornoFine = giornoFine;
		this.meseFine = meseFine;
		this.annoFine = annoFine;

		dataInizio = LocalDate.of(annoInizio, meseInizio, giornoInizio);
		dataFine = LocalDate.of(annoFine, meseFine, giornoFine);

		this.validDestinazione();
		this.validGiorno();
		this.validMese();
		this.validAnno();
		this.validDataInizio();
		this.validDataFine();
	}

	// Attributi di Validazione

	public void validDestinazione() throws Exception {
		if (destinazione.equals(null) || destinazione.equals("")) {
			throw new Exception("Devi scrivere qualcosa nel campo destinazione!");
		}
	}

	public void validGiorno() throws Exception {
		if (giornoInizio == 0 || giornoFine == 0) {
			throw new Exception("Devi scrivere qualcosa nel campo del giorno e non pu? essere 0!");
		}
	}

	public void validMese() throws Exception {
		if (meseInizio == 0 || meseFine == 0) {
			throw new Exception("Devi scrivere qualcosa nel campo del mese e non pu? essere 0!");
		}
	}

	public void validAnno() throws Exception {
		if (annoInizio == 0 || giornoFine == 0) {
			throw new Exception("Devi scrivere qualcosa nel campo dell*anno e non pu? essere 0!");
		}
	}

	public void validDataInizio() throws Exception {
		if (dataInizio.isBefore(LocalDate.now())) {
			throw new Exception(
					"La data di inizio non pu? essere nel passato, non sappiamo ancora viaggiare nel tempo! ");
		}
	}

	public void validDataFine() throws Exception {
		if (dataInizio.isBefore(dataInizio)) {
			throw new Exception("La data di fine non pu? essere precedente a quella di inizio!");
		}
	}

	// Formattatore data
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	// Metodi

	public Period calcolaVacanza() {
		Period etaPeriod = Period.between(dataInizio, dataFine);

		return etaPeriod;

	}

	// Getter
	public String getDataInizioFormat() {
		return formatter.format(dataInizio);
	}

	public String getDataFineFormat() {
		return formatter.format(dataFine);
	}

	@Override
	public String toString() {
		return "Hai appena prenotato per andare a : " + destinazione + ". La vacanza selezionata durer?: "
				+ calcolaVacanza() + " giorni, Buona vacanza!";
	}

}
