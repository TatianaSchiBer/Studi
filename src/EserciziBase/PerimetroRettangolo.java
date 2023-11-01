package EserciziBase;

import java.util.Scanner;

public class PerimetroRettangolo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserire la base del rettangolo: ");
		double base = sc.nextDouble();
		System.out.println("Inserire l'altezza del rettangolo: ");
		double altezza = sc.nextDouble();
		double perimetro = 2*(base+altezza);
		System.out.println("Il perimetro del rettangolo è : " + perimetro);
		
	}

}
