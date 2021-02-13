package workingtalent;

public class Opdracht2 {
	public static void main(String[] args) {
		System.out.println("Hallo!");
		System.out.println("Hier komt opdracht2:");

		// te checken woord en letter aanmaken
		String stringecheck = "regenen";
		char e = 'e';
		
		// for loop runnen om aantal e's te tellen
		int aantales = 0;
		for (int i = 0 ; i < stringecheck.length() ; i++) {
			char letter = stringecheck.charAt(i);
			if (letter == e) {
				aantales = aantales + 1;
			}
		}
		// aantal e's printen
		System.out.println("Het aantal "+e+"'s in "+stringecheck+" is "+aantales);
	}	
}