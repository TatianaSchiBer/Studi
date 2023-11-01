package EserciziBase;

import java.util.Scanner;

public class MinutiInOre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserire un numero intero che rappresenta un tempo espresso in minuti: ");
		
		int min = sc.nextInt();
		
		int ore = min/60;
		int min2 = min%60;
		
		System.out.println("Il tempo in ore è: " + ore + " ore e " + min2 + " min");

	}

}
