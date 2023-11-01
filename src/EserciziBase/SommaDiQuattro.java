package EserciziBase;


import java.util.Scanner;

public class SommaDiQuattro {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int somma = 0;
		for(int i = 0; i<4; i++) {
			System.out.println("Inserire un numero intero: ");
			int num = sc.nextInt();
			 somma = somma + num;
		}
		System.out.println("La soma è: " + somma);
	}
	
}
