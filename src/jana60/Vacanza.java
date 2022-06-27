package jana60;

import java.time.LocalDate;

public class Vacanza {

	// Attributi
	private String destinazione;
	private int giornoInizio, meseInizio, annoInizio, giornoFine, meseFine, annoFine;

	public Vacanza(String destinazione, int giornoInizio, int meseInizio, int annoInizio, int giornoFine, int meseFine,
			int annoFine) throws Exception {
		super();
		this.destinazione = destinazione;
		this.giornoInizio = giornoInizio;
		this.meseInizio = meseInizio;
		this.annoInizio = annoInizio;
		this.giornoFine = giornoFine;
		this.meseFine = meseFine;
		this.annoFine = annoFine;

		this.validDestinazione();
		this.validGiorno();
		this.validMese();
		this.validAnno();
	}

	LocalDate dataInizio = LocalDate.of(annoInizio, meseInizio, giornoInizio);
	LocalDate dataFine = LocalDate.of(annoFine, meseFine, giornoFine);

	// Attributi di Validazione

	public void validDestinazione() throws Exception {
		if (destinazione.equals(null)) {
			throw new Exception("Devi scrivere qualcosa nel campo destinazione!");
		}
	}

	public void validGiorno() throws Exception {
		if (giornoInizio == 0 || giornoFine == 0) {
			throw new Exception("Devi scrivere qualcosa nel campo del giorno e non può essere 0!");
		}
	}

	public void validMese() throws Exception {
		if (meseInizio == 0 || meseFine == 0) {
			throw new Exception("Devi scrivere qualcosa nel campo del mese e non può essere 0!");
		}
	}

	public void validAnno() throws Exception {
		if (annoInizio == 0 || giornoFine == 0) {
			throw new Exception("Devi scrivere qualcosa nel campo dell*anno e non può essere 0!");
		}
	}

	public void validDataInizio() throws Exception {
		if (dataInizio.isBefore(LocalDate.now())) {
			throw new Exception(
					"La data di inizio non può essere nel passato, non sappiamo ancora viaggiare nel tempo! ");
		}
	}

	public void validDataFine() throws Exception {
		if (dataInizio.isBefore(dataInizio)) {
			throw new Exception("La data di fine non può essere precedente a quella di inizio!");
		}
	}

}
