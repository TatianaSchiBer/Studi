package EserciziArray;

public class CopiaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {1,2,3,4,5,6,7,8,9};
		int[] array2 = new int[5];
		
		System.arraycopy(array1, 0, array2, 0, 4);
		
		for(int valore : array2) {
		System.out.println(valore);
		
		}
	}

}
