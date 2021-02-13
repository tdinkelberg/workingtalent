package kermispack;

class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	int kaartjes = 0;
	double omzet = 0;
	
	void draaien(Attractie attractie) {
		// weergeven dat attractie draait
		System.out.println("De attractie "+attractie.naam+" draait");
		
		// kaartjes en omzet bijwerken
		attractie.kaartjes++;
		attractie.omzet = attractie.omzet + attractie.prijs;
	}
}