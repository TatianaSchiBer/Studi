package EserciziControwflow;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int x = 1;
		int y = 0;
		int temp;
		
		for(int i = 0; i<100; i++) {
			System.out.print(x+" ");
			temp = x;
			x = y+x;
			y= temp;
			
			
			
		}
		
	}

}
