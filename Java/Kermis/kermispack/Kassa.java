package kermispack;

class Kassa {
	double omzetTotaal = 0;
	int kaartjesTotaal = 0;
	double belastingTotaal = 0;
	int aantalBezoeken = 0;
		
	void afrekenen(Attractie attractie) {
		omzetTotaal = omzetTotaal + attractie.prijs;
		kaartjesTotaal++;
	}
	
	void outputOmzet(Kermis kermis) {
		//omzet per attractie
		for (int i = 0 ; i < kermis.attracties.length ; i++) {
			double afgerondeomzet = Math.round(kermis.attracties[i].omzet * 100d) / 100d;
			System.out.println("De omzet van "+kermis.attracties[i].naam+" is: €"+afgerondeomzet);
		}
		//omzet totaal
		double afgerondeomzetTotaal = Math.round(omzetTotaal * 100d) / 100d;
		System.out.println("De totale omzet is: €"+afgerondeomzetTotaal);
	}
	
	void outputKaartjes(Kermis kermis) {
		//kaartjes per attractie
		for (int i = 0 ; i < kermis.attracties.length ; i++) {
			System.out.println("Het aantal verkochte kaartjes bij "+kermis.attracties[i].naam+" is: "+kermis.attracties[i].kaartjes);
		}
		//kaartjes totaal
		System.out.println("Het totaal aantal verkochte kaartjes is: "+kaartjesTotaal);
	}
	
	void outputBelasting(Kermis kermis) {
		//aantal keer dat de belastinginspecteur is langsgekomen
		System.out.println("De belastinginspecteur is "+aantalBezoeken+" keer langsgekomen");
		//hoeveel geld die de belastingsinspecteur heeft meegenomen
		double afgerondebelasting = Math.round(belastingTotaal * 100d) / 100d;
		System.out.println("De belastinginspecteur heeft in totaal €"+afgerondebelasting+" aan belasting geïnd");
	}
}
