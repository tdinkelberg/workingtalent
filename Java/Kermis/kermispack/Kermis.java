package kermispack;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Kermis {
	//public variables
	Attractie attracties[] = new Attractie[6];
	Kassa kassa = new Kassa();
	BelastingInspecteur belastinginspecteur = new BelastingInspecteur();
	
	// maak attracties aan en verwelkom
	Kermis(){
		attracties[0] = new Botsauto();
		attracties[1] = new Spin();
		attracties[2] = new Spiegelpaleis();
		attracties[3] = new Spookhuis();
		attracties[4] = new Hawaii();
		attracties[5] = new Ladderklimmen();
		
		// start interactie
		System.out.println("Welkom op de kermis! \n");
		System.out.println("Optiemenu:\n");
		
		System.out.println("Een ritje maken");
		System.out.println("Selecteer een getal om in één van de attracties te gaan:");
		for (int i = 0 ; i < attracties.length ; i++) {
			System.out.println((i+1)+": "+attracties[i].naam);
		}
		System.out.println(" ");
		System.out.println("Info opvragen");
		System.out.println("Selecteer 'o' om de omzet te zien");
		System.out.println("Selecteer 'k' om het aantal verkochte kaartjes te zien");
		System.out.println("Selecteer 'b' om de belastinggegevens te zien \n");
		System.out.println("Selecteer 'end' om de kermis te verlaten");
	}
	
	// checken of er wordt gekozen voor een attractie (int) of een andere optie (string)
	void inputcheck(Kermis kermis) {
		boolean scanneraan = true;
		// scanner input
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		// check of input is een nummer of een letter
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
	    // bij nummer start de attractie
	    if (checkint) {
	    	kermis.attractiestarten(kermis, Integer.parseInt(input)-1);
	    }
	    else {
			String strinput = input;
			// bij o output totale omzet
			if (strinput.equals("o")){
				kermis.kassa.outputOmzet(kermis);
			}
			// bij k output aantal kaartjes
			else if (strinput.equals("k")) {
				kermis.kassa.outputKaartjes(kermis);
			}
			// bij b output belastinginfo
			else if (strinput.equals("b")) {
				kermis.kassa.outputBelasting(kermis);
			}
			// scanner uitzetten bij end
			else if (strinput.equals("end")) {
				System.out.println("DOEI DOEI!");
				scanneraan = false;	
			}
			else {
				System.out.println("Geen geldige input, kies één van de gegeven opties");
			}
		}
	    if (scanneraan) {
	    	inputcheck(kermis);
	    }
	}
	
	void attractiestarten(Kermis kermis, int attractienummer) {
		// attractienr bepalen adh van input
		Attractie attractie = attracties[attractienummer];
		//kijken of attractie risicovol is
		if (attractie instanceof RisicoRijkeAttractie) {
			RisicoRijkeAttractie rrattractie = (RisicoRijkeAttractie) attractie;
			// bij risicovolle attractie checken of hij gekeurd is
			try {
				draaiLimietCheck(rrattractie);
			} 
			catch (AttractieDraailimietException adle){
				System.out.println("De "+attractie.naam+" heeft zijn draailimiet overschreden");
			}
			if (!rrattractie.goedGekeurd) {
				System.out.println("Deze attractie moet eerst gekeurd worden voor hij mag gaan draaien");
				System.out.println("Selecteer 'm' om een monteur de keuring uit te laten voeren");
				// scanner input
				String input = " ";
				while (!input.equals("m")) {
					Scanner sc = new Scanner(System.in);
					input = sc.nextLine();
					if (input.equals("m")) {
						opstellingsKeuring(rrattractie);
					}
					else {
						System.out.println("De monteur moet eerst geroepen worden voor je verder kan");
					}
				}
			}
			if (rrattractie.goedGekeurd) {
				attractie.draaien(rrattractie);
				kassa.afrekenen(attractie);
			}	
		}
		else {
			// draaien & afrekenen (zowel totaal als lokaal aanpassen)
			attractie.draaien(attractie);
			kassa.afrekenen(attractie);
		}
		//random de belastinginspecteur langs laten komen (1 per 15 keer)
		int randomNum = ThreadLocalRandom.current().nextInt(1, 16);
		if (randomNum == 1) {
			belastinginspecteur.bezoek(kermis);
		}	
	}
	
	void draaiLimietCheck(RisicoRijkeAttractie attractie) throws AttractieDraailimietException {
		int kaartjes = attractie.kaartjes;
		int draaiLimiet = attractie.draaiLimiet;
		if (kaartjes > 1 && (kaartjes % draaiLimiet) == 0 ){
			
			throw new AttractieDraailimietException();
		}	
	}
	
	void opstellingsKeuring(RisicoRijkeAttractie attractie) {
		System.out.println("De monteur heeft "+attractie.naam+" goedgekeurd");
		attractie.goedGekeurd = true;
	}
}
	

