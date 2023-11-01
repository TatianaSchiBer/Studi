package EserciziControwflow;

import java.util.Scanner;

public class MediaMultipliDiTre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti numeri vuoi inseriri?");
		int n = sc.nextInt();
		int soma = 0;
		int contador = 0;
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Insirire il " + i +" numero intero:");
			int numero = sc.nextInt();
			if(numero%3==0) {
				contador++;
				soma+=numero;
			}
		}
		System.out.println("La media dei numeri divisibili per tre; " + soma/contador);
		
		
	}

}
