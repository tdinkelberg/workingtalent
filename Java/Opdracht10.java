package workingtalent;

import java.util.Scanner;

public class Opdracht10 {
	public static void main(String[] args) {
		System.out.println("Hallo!");
		System.out.println("Hier komt opdracht10:");
		System.out.println("Zorg dat elk woord begint met de laatste letter van het vorige woord");
		System.out.println("Ik ga op vakantie en neem mee...");
		
		// variabele aan zolang spel bezig is
		boolean spelbezig = true;
		
		// STEL HIER AANTAL BEURTEN VAN HET SPEL IN
		int plaatseninkoffer = 5;
		// initialiseren variabelen
		String voorwerp = new String();
		String kofferinhoud = new String();
		char laatstelettervakantie = 'a';
		char eerstelettervakantie = 'a';
		
		// lopen tot iemand af gaat
		for (int i = 0 ; i < plaatseninkoffer ; i++) {
			if (i > 0) {
			laatstelettervakantie = voorwerp.charAt(voorwerp.length()-1);
			}
			Scanner sc = new Scanner(System.in);
			voorwerp = sc.nextLine();
			if (i == 0) {
				kofferinhoud = kofferinhoud + voorwerp;
			}
			else {
				kofferinhoud = kofferinhoud + ", " + voorwerp;
			}
			eerstelettervakantie = voorwerp.charAt(0);
			if (laatstelettervakantie == eerstelettervakantie || i == 0) {
				if (i == plaatseninkoffer - 1) {
					System.out.println("Gefeliciteerd! Jouw koffer zit vol met: "+kofferinhoud); 
					System.out.println("Nu kan je lekker op vakantie");
				}
				else {
					System.out.println("Goedzo, nu de volgende!");
					System.out.println("Er zit in de koffer: "+kofferinhoud);
					System.out.println("Ik ga op vakantie en neem mee...");
				}
			}
			if (laatstelettervakantie != eerstelettervakantie && i != 0) {
				System.out.println("FOUT! Jij bent af");
				i = plaatseninkoffer;
			}
		}	
	}
}
