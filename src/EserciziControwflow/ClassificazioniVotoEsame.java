package EserciziControwflow;

import java.util.Scanner;

public class ClassificazioniVotoEsame {
	
//	Una classe di 10 studenti ha sostenuto un esame.
//
//	I voti sono espressi con lettere:
//
//	'O' = ottimo (corrispondente al 10),
//	'B' = buono (8),
//	'S' = sufficiente (6),
//	'I' = insufficiente (4).
//	Scrivere un programma che consenta il calcolo della media aritmetica dei voti di tale esame.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti studenti ci sono: ");
		int numStudenti = sc.nextInt();
		
		int sommaVoti = 0;
		
		for(int i = 1; i<=numStudenti; i++) {
		System.out.println("Inserisci il voto (O/B/S/I) dello studente");
		char voto = sc.next().charAt(0);
		
		int valore;
		switch (voto) {
		
		case 'O' : 
			valore = 10;
			break;
		case 'B':
			valore = 8;
			break;
		case 'S':
			valore = 6;
			break;
		case 'I': 
			valore = 4;
			break;
		default:
		System.out.println("Voto non valido. Insirisci O,B,S o I:");
		i--;
		continue;
			
		}
		sommaVoti+= valore;
	
	}
		System.out.println("media = " + sommaVoti/numStudenti);
		
	sc.close();
	}

}
