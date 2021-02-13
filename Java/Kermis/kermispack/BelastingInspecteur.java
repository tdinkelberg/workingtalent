package kermispack;

public class BelastingInspecteur {
	void bezoek(Kermis kermis) {
		for (int i = 0 ; i < kermis.attracties.length ; i++) {
			Attractie attractie = kermis.attracties[i];
			if (attractie instanceof GokAttractie) {				
				double belasting = ((GokAttractie) attractie).kansSpelBelastingBetalen(attractie);
				attractie.omzet = attractie.omzet - belasting;
				kermis.kassa.omzetTotaal = kermis.kassa.omzetTotaal - belasting;
				kermis.kassa.belastingTotaal = kermis.kassa.belastingTotaal + belasting;
				if (belasting > 0);{
					double afgerondebelasting = Math.round(belasting * 100d) / 100d;
					System.out.println("De belastinginspecteur komt op bezoek en haalt €"+afgerondebelasting+" op bij de attractie: "+attractie.naam);
				}
			}
		}
		kermis.kassa.aantalBezoeken++;
	}
}
