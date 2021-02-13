package workingtalent;

import java.util.Arrays;

public class Opdracht3 {
	public static void main(String[] args) {
		System.out.println("Hallo!");
		System.out.println("Hier komt opdracht3:");

		// maar array aan met op te tellen getallen
		int intArray[] = {1, 2, 3, 4};
		String strsummArray[] = new String[intArray.length];		
		
		// tel de array op met een for loop
		int summArray = 0;

		for (int i = 0 ; i < intArray.length ; i++) {
			summArray = summArray + intArray[i];
			strsummArray[i] = String.valueOf(intArray[i]);
		}
		
		System.out.println("De meegegeven array is");
		System.out.println(Arrays.toString(strsummArray));
		System.out.println("De som van de meegegeven array is "+summArray);
	}
}
