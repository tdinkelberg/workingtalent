package workingtalent;

import java.util.Scanner;

public class Opdracht7 {
	public static void main(String[] args) {
		System.out.println("Hallo!");
		System.out.println("Hier komt opdracht7:");
		String teradenwoord = "fiets";
		
		System.out.println("kan jij dit woord raden?");
		String raadveld = "";
		for (int i = 0 ; i < teradenwoord.length() ; i++) {
			raadveld = raadveld+"_ ";
		}
		System.out.println(raadveld);
		
		// scanner input
		Scanner sc = new Scanner(System.in);
		System.out.println("Doe eens een gokje");
		String geradenwoord = sc.nextLine();
		
		char alertcode[] = new char[teradenwoord.length()];
		
		for (int i = 0 ; i < teradenwoord.length() ; i++) {
			char echteletter = teradenwoord.charAt(i);
			char geradenletter = geradenwoord.charAt(i);
			String stringgeradenletter = String.valueOf(geradenletter);
			
			if (teradenwoord.contains(stringgeradenletter)) {
				alertcode[i] = '1';
			}			
			if (echteletter == geradenletter) {
				alertcode[i] = '2';
			}
			if (!teradenwoord.contains(stringgeradenletter)) {
				alertcode[i] = '0';	
			}
		}
		String alertcodestring = String.valueOf(alertcode);	
		System.out.println(alertcodestring);	
	}
}
