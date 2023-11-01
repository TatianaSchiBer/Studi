package EserciziBase;

import java.util.Scanner;

public class OreInMinuti {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserire un numero frazionario che representa um tempo in ore: ");
		float ore = sc.nextFloat();
		float minuti = ore*60;
		
		System.out.println("Il tempo in minuti è di: " + (int)minuti);
		
		
	}
	
	
}
