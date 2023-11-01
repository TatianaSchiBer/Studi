package EserciziControwflow;

import java.util.Scanner;

public class Ripetizione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
		System.out.println("Quanti caratteri vuoi inserire ?");
		int quantita = sc.nextInt();
		
		if(quantita>0) {
		System.out.println("Inserisce la sequenza di caracteri: ");
		
		char[]sequenza = new char[quantita];
			for (int j=0; j<quantita;j++) {
				sequenza[j]=sc.next().charAt(0);
			}
				System.out.println("I caratteri insetitti sono: ");
				for(char carattere : sequenza){
				System.out.println(carattere);
			}
	}else {System.out.println("Inserisce un numero intero positivo!");
		
	}	
	}
	}
}
