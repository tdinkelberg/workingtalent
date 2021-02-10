package workingtalent;

import java.util.Arrays;
import java.util.Scanner;

public class Opdracht6 {
	public static void main(String[] args) {
		System.out.println("Hallo!");
		System.out.println("Hier komt opdracht6:");
		
		// scanner input
		Scanner sc = new Scanner(System.in);
		System.out.println("Welke String wil je graag alfabetisch hebben?");
		String str = sc.nextLine();
		System.out.println("Oh dus jij wil graag dat ik dit sorteer: "+str);
		System.out.println(str);
		
	    char charArray[] = str.toCharArray();
	    Arrays.sort(charArray);
	    
	    System.out.println("Nou alsjeblieft hier is die:");
	    System.out.println(new String(charArray));
	}
}

