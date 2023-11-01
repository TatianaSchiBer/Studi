package EserciziControwflow;

import java.util.Scanner;

public class Tabellina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int num = sc.nextInt();
		for(int i=0; i<11; i++) {
			int prod = num * i;
			System.out.println(num + " x " + i +" = " + prod);
		} 

	}

}
