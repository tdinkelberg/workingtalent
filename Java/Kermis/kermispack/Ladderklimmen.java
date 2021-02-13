package kermispack;

class Ladderklimmen extends Attractie implements GokAttractie {
	Ladderklimmen(){
		naam = "ladderklimmen";
		prijs = 5.00;
	}

	public double kansSpelBelastingBetalen(Attractie attractie) {
		double belasting =  0.3 * attractie.omzet;
		return belasting;
	}
}
