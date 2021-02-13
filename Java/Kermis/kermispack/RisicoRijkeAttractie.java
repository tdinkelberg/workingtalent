package kermispack;

abstract class RisicoRijkeAttractie extends Attractie {
	int draaiLimiet;
	boolean goedGekeurd = false;
	
	void draaien(Attractie attractie){
		System.out.println("De attractie "+attractie.naam+" draait");
		attractie.kaartjes++;
		attractie.omzet = attractie.omzet + attractie.prijs;
		//als deze attractie zijn draailimiet bereikt moet hij weer gekeurd worden
		if (kaartjes > 1  && (attractie.kaartjes % draaiLimiet) == 0 ){
			goedGekeurd = false;
		}
	}
}
