package EserciziControwflow;

import java.util.Scanner;

public class TuttiPositiviPari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti numeri vuoi inserire?");
		int n = sc.nextInt();
		
		boolean positivipari = true;
		for (int i = 1; i < n+1; i++) {
			System.out.println("Inserisce il numero " + i +":" );
			int numero = sc.nextInt();
			if(numero<0 || numero%2!=0)positivipari=false;
			
		}
		if(positivipari) {
			System.out.println("Tutti positive");
		}else {
			System.out.println("NO");
		}

	}

}
