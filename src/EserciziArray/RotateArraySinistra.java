package EserciziArray;

public class RotateArraySinistra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5};
		int n = 2;
		
		System.out.println("Array originale: ");
		
		printArray(array);
		
		rotateSinistra(array, n);
		
		System.out.println();
		
		System.out.println("Array dopo la rotazione a sinistra: " );
		printArray(array);
	}

	private static void rotateSinistra(int[] array, int n) {
		// TODO Auto-generated method stub
		
		
		int lenght = array.length;
		n = n % lenght;
		
		int[] temp = new int[lenght];
		
		for(int i = 0; i< lenght; i++) {
			temp[i]= array[(i+n)% lenght];
		}
		
		System.arraycopy(temp, 0, array, 0, lenght);
		
	}

	private static void printArray(int[] array) {
		// TODO Auto-generated method stub
		for ( int num: array) {
			System.out.print(num + " ");
		}
		
		
	}

}
