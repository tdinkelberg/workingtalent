package workingtalent;

import java.util.Scanner;

public class Kermis {
	public static void main(String[] args) {
		// maak attracties aan
		Attractie [] attracties = new Attractie[6];
		attracties[0] = new Botsauto();
		attracties[1] = new Spin();
		attracties[2] = new Spiegelpaleis();
		attracties[3] = new Spookhuis();
		attracties[4] = new Spiegelpaleis();
		attracties[5] = new Ladderklimmen();
		
		// start interactieve interface
		System.out.println("Welkom op de kermis! \n");
		System.out.println("Opties:");
		System.out.println("Selecteer een getal van 1-6 om een attractie te laten draaien");
		System.out.println("Selecteer o voor de totale omzet, of selecteer k voor totaal aantal verkochte kaartjes");
		System.out.println("Selecteer end om de kermis te verlaten");
		
		boolean scanneraan = true;
		while (scanneraan) {
			// scanner input
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			// check wheter input is a number or a letter
			boolean checkint;
			checkint = true;
			if (input == null) {
		        checkint = false;
		    }
		    try {
		        int i = Integer.parseInt(input);
		    } 
		    catch (NumberFormatException nfe) {
		        checkint = false;
		    }
		    
		    // if number give ridenr
			if (checkint) {
				int attractienr = Integer.parseInt(input)-1;
				Attractie.draaien(attracties[attractienr]);
			}
			// if letter do other action
			else {
				String strinput = input;
				// bij o bereken totale omzet en output
				if (strinput.equals("o")){
					int kassa = 0;
					//omzet per attractie
					for (int i = 0 ; i < attracties.length ; i++) {
						System.out.println("De omzet van "+attracties[i].naam+"is: €"+attracties[i].kassa);
					}
					//omzet totaal
					for (int i = 0 ; i < attracties.length ; i++) {
						kassa = kassa + attracties[i].kassa;
					}
					System.out.println("De totale omzet is: €"+kassa);
				}
				// bij k bereken totaal aantal kaartjes en output
				if (strinput.equals("k")) {
					//kaartjes per attractie
					for (int i = 0 ; i < attracties.length ; i++) {
						System.out.println("Het aantal verkochte kaartjes bij "+attracties[i].naam+" is: "+attracties[i].kaartjes);
					}
					//kaartjes totaal
					int kaartjes = 0;
					for (int i = 0 ; i < attracties.length; i++) {
						kaartjes = kaartjes + attracties[i].kaartjes;
					}
					System.out.println("Het totaal aantal verkochte kaartjes is: "+kaartjes);
				}
				// scanner uitzetten
				if (strinput.equals("end")) {
					System.out.println("DOEI DOEI!");
					scanneraan = false;
				}
			}
		}
	}
}

class Attractie {
	String naam;
	double prijs;
	int kaartjes = 0;
	double kassa = 0;
	
	static void draaien(Attractie attractie) {
		System.out.println("De attractie "+attractie.naam+" draait");
		attractie.kaartjes = attractie.kaartjes + 1;
		attractie.kassa = attractie.kassa + attractie.prijs;
	}
}

abstract class RisicoRijkeAttractie extends Attractie{
	int draaiLimiet;
	opstellingsKeuring(){
		
	}
}

interface GokAttractie{
	double belastingreserve;
	static void kansSpelBelastingBetalen(Attractie attractie){
		belastingreserve = attractie.prijs * attractie.kaartjes * 0.30;
	}
}

class Botsauto extends Attractie {
	Botsauto(){
		naam = "botsauto's";
		prijs = 2.50;
	}
}

class Spin extends RisicoRijkeAttractie {
	Spin(){
		naam = "spin";
		prijs = 2.25;
	}
}

class Spiegelpaleis extends Attractie {
	Spiegelpaleis(){
		naam = "spiegelpaleis";
		prijs = 2.75;
	}
	
}	

class Spookhuis extends Attractie {
	Spookhuis(){
		naam = "spookhuis";
		prijs = 3.20;
	}
	
}

class Hawaii extends RisicoRijkeAttractie {
	Hawaii(){
		naam = "hawaii";
		prijs = 2.90;
	}
	
}

class Ladderklimmen extends Attractie {
	Ladderklimmen(){
		naam = "ladderklimmen";
		prijs = 5.00;
	}

	}
}