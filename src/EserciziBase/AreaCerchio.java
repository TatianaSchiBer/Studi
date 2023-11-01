package EserciziBase;

import java.util.Scanner;

public class AreaCerchio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double pigreco = Math.PI;
		
		System.out.println("Inserisce la lunghezza del raggio di un cerchio: ");
		double raggio = sc.nextDouble();
		double area = pigreco*Math.pow(raggio, 2);
		//double area = raggio*raggio*pigreco;
		
		System.out.println("L'area del cerchio è di: " + area);
		
		
	}

}
