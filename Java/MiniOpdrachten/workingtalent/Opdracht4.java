package workingtalent;

import java.util.Random;
import java.util.Arrays;

public class Opdracht4 {
	public static void main(String[] args) {
		System.out.println("Hallo!");
		System.out.println("Hier komt opdracht4:");

		// Geef waardes aan voor random array
		int min = 0; // geef minimum waarde binnen de array aan
		int max = 50; // geef maximum waarde binnen de array aan
		max = max + 1; // maximum + 1 omdat method max - 1 doet 
		int lengthArray = 10; // geef lengte van de array aan
		
		// instance all
		int intArrayrand[] = new int[lengthArray];
		String strArrayrand[] = new String[intArrayrand.length];
		Random rand = new Random();
		
		// maak random array
		for (int i = 0 ; i < lengthArray ; i++) {
			intArrayrand[i] = rand.nextInt(max-min) + min; //array vullen
			strArrayrand[i] = String.valueOf(intArrayrand[i]); //string van de array maken
		}
		
		// output de random array
		System.out.println("De getallen in de random array zijn:");
		System.out.println(Arrays.toString(strArrayrand));
		
		//sort de array en output de gesorteerde array
		int intArrayrandsort[] = intArrayrand;
		Arrays.sort(intArrayrandsort);
		System.out.println("De gesorteerde versie van de random array is:");
		System.out.println(Arrays.toString(intArrayrandsort));
	}
}
