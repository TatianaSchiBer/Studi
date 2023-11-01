package EserciziControwflow;

import java.util.Scanner;

public class Ripetizioni {
	
//	Scrivere un programma Ripetizioni che chiede all’utente di inserire 
//	una sequenza di caratteri (chiedendo prima quanti caratteri voglia inserire) 
//	e li ristampa man mano che vengono inseriti.
//
//	L’intero procedimento (chiedere quanti caratteri voglia inserire, leggere i 
//			caratteri e man mano stamparli) dovrà essere ripetuto 5 volte.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a=0;
		
		do {
		System.out.println("Quanti caratteri vuoi inserire: ");
		int quantita = sc.nextInt();
		sc.nextLine();
		
			System.out.println("Inserisce la sequenza di string con " + quantita + " caratteri:");
			
			String sequenza = sc.next();
			for(int i=0; i<quantita; i++) {
				char caractere = sequenza.charAt(i);
			System.out.println(caractere);
			
		}++a;
		
		
		
	}while(a<5);
	}
}
