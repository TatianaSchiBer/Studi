package EserciziBase;

import java.util.Scanner;

public class SommaApprossimata {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserire 2 numeri con la virgula: ");
		
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float somma = num1 + num2;
		
		System.out.println("La somma approssimata è:  " + Math.round(somma));
		

	}

}
