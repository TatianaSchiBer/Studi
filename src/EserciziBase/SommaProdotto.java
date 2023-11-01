package EserciziBase;

import java.util.Scanner;

public class SommaProdotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri interi: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int somma = a+b;
		int prodotto = a*b;
		
		System.out.println("La somma dei numeri: "+ somma +", il prodotto: "+ prodotto );

	}

}
