package EserciziControwflow;

import java.util.Scanner;

public class Esercizio44Gatti {

	
//	Scrivere un programma per stampare 44 caratteri (inseriti da tastiera) in fila per 6 con resto di 2.


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String srt = sc.nextLine();
		
		for (int i=0; i<44; i++) {
			System.out.print(srt.charAt(i));
			if((i+1)%6 == 0) {
				System.out.println();
			}
		}
		
		
	}

}
