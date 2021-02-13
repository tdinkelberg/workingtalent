package kermispack;

class Spin extends RisicoRijkeAttractie implements GokAttractie {
	Spin(){
		naam = "spin";
		prijs = 2.25;
		draaiLimiet = 5;
	}
	
	public double kansSpelBelastingBetalen(Attractie attractie) {
		double belasting =  attractie.kaartjes * 0.3 * attractie.prijs;
		return belasting;
	}
}
