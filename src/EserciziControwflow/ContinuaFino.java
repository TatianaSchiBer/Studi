package EserciziControwflow;

import java.util.Scanner;

public class ContinuaFino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int soma=0;
		int n;
		
		while(true) {
			System.out.println("Inserisce una sequenza di enteri: ");
			n = sc.nextInt();
			if(n<0 && n%2==0 || n>0 && n%3==0) {
				soma+=n;
			}else {
				break;
			}
		
		}System.out.println(soma);
		}
}


