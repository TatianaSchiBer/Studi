package EserciziBase;

import java.util.Scanner;

public class Divisione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri interi: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int quoziente = a/b;
		int resto = a%b;
		
		System.out.println("Il quoziente della divisione è: " + quoziente + ", il resto della divisione è: " + resto);
		

	}

}
