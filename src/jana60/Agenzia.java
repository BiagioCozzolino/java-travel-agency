package jana60;

import java.util.Scanner;

public class Agenzia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			try {
				System.out.println("Salve, benvenuto nella travel agency Java!");
				System.out.print("Inserisci la tua destinazione: ");
				String destinazione = scan.nextLine();
				System.out.print("Inserisci il giorno di inizio: ");
				int giornoInizio = Integer.parseInt(scan.nextLine());
				System.out.print("Inserisci il mese di inizio: ");
				int meseInizio = Integer.parseInt(scan.nextLine());
				System.out.print("Inserisci il anno di inizio: ");
				int annoInizio = Integer.parseInt(scan.nextLine());
				System.out.print("Inserisci il giorno di fine vacanza: ");
				int giornoFine = Integer.parseInt(scan.nextLine());
				System.out.print("Inserisci il mese di fine vacanza: ");
				int meseFine = Integer.parseInt(scan.nextLine());
				System.out.print("Inserisci il anno di fine vacanza: ");
				int annoFine = Integer.parseInt(scan.nextLine());

				Vacanza vacanza = new Vacanza(destinazione, giornoInizio, meseInizio, annoInizio, giornoFine, meseFine,
						annoFine);
				System.out.println("Hai selezionato come data di inizio: " + vacanza.getDataInizioFormat());
				System.out.println("Hai selezionato come data di inizio: " + vacanza.getDataFineFormat());
				System.out.println(vacanza.toString());
			} catch (NumberFormatException nfe) {
				System.out.println(
						"Hai inserito un carattere non valido Inserisci solo numeri tranne che per la Destinazione!");
				System.out.println(nfe.getMessage());
			} catch (Exception e) {
				System.out.println("Hai sbagliato ad immettere il seguente dato: ");
				System.out.println(e.getMessage());
			}

		} while (flag);

		scan.close();
	}

}
