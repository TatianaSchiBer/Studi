package EserciziArray;

import java.util.HashMap;
import java.util.Map;

public class FrequenzaElementiArray {
	
	public static void main(String[] args) {
		
		int[] array = {2,3,5,6,2,5,4,7,8,32,0,1,2,3,4};
		
		Map<Integer,Integer> frequenza = new HashMap<>();
		
		for(int elemento : array) {
			if(frequenza.containsKey(elemento)) {
				frequenza.put(elemento, frequenza.get(elemento)+1);
			}else{
				frequenza.put(elemento, 1);
				
		}
	}
		for(Map.Entry<Integer, Integer> entry : frequenza.entrySet()) {
			System.out.println("Elemento: " + entry.getKey() + ", Frequenza: " + entry.getValue());
		}
	}
}

				