package EserciziBase;

import java.util.Scanner;

public class RadiceQuadrata {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserire un numero intero: ");
		double numero = sc.nextDouble();
		
		System.out.println("La radice quadrata di " + numero + " è " + Math.sqrt(numero));
	}

}
