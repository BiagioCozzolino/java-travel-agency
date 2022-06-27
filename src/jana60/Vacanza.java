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
		this.validDestinazione();
		this.giornoInizio = giornoInizio;
		this.meseInizio = meseInizio;
		this.annoInizio = annoInizio;
		this.giornoFine = giornoFine;
		this.meseFine = meseFine;
		this.annoFine = annoFine;
	}

	LocalDate dataInizio = LocalDate.of(annoInizio, meseInizio, giornoInizio);
	LocalDate dataFine = LocalDate.of(annoFine, meseFine, giornoFine);

	// Attributi di Validazione

	public void validDestinazione() throws Exception {
		if (destinazione.equals(null)) {
			throw new Exception("Devi scrivere qualcosa nel campo destinazione!");

		}
	}

}
