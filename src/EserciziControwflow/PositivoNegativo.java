package EserciziControwflow;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorPrecedente = 0;

		boolean sequenzaPositivoNegativo = false;

		while (true) {
			System.out.println("Inserisci un intero o (0 per terminare): ");
			int valore = sc.nextInt();

			if (valore == 0) {
				break;
			}
			if (valorPrecedente > 0 && valore < 0) {
				sequenzaPositivoNegativo = true;
			}
			valorPrecedente = valore;
			}
			if (sequenzaPositivoNegativo) {
				System.out.println("OK");
			} else {
				System.out.println("NO");

		}
	}
}
