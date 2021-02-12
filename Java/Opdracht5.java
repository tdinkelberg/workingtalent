package workingtalent;

public class Opdracht5 {
	public static void main(String[] args) {
		System.out.println("Hallo!");
		System.out.println("Hier komt opdracht5:");
		
		// Wat is er kapot?
		boolean kapotmotor = false;
		boolean kapotdeur = false;
		boolean kapotvoorruit = false;
		boolean kapotuitlaat = false;
		Auto auto1 = new Auto(kapotmotor, kapotdeur, kapotvoorruit, kapotuitlaat);
		Monteur.repareren(auto1);
	}
}

class Monteur {
	static void repareren(Auto auto) {
		int kosten = 0;
		if (auto.motor == true) {
			auto.motor = false;
			System.out.println("Monteur: Die motor ziet er niet zo goed uit, die zal ik even opknappen");
			kosten = kosten +25;
		}
		if (auto.motor == false) {
			System.out.println("Monteur: De motor is in prima staat");
		}
		if (auto.deur == true) {
			auto.deur = false;
			System.out.println("Monteur: Die deur ziet er niet zo goed uit, die zal ik even opknappen");
			kosten = kosten +25;			
		}
		if (auto.deur == false) {
			System.out.println("Monteur: De deur is in prima staat");
		}
		if (auto.voorruit == true) {
			auto.voorruit = false;
			System.out.println("Monteur: Die voorruit ziet er niet zo goed uit, die zal ik even opknappen");
			kosten = kosten +25;			
		}
		if (auto.voorruit == false) {
			System.out.println("Monteur: De voorruit is in prima staat");
		}
		if (auto.uitlaat == true) {
			auto.uitlaat = false;
			System.out.println("Monteur: Die uitlaat ziet er niet zo goed uit, die zal ik even opknappen");
			kosten = kosten +25;			
		}
		if (auto.uitlaat == false) {
			System.out.println("Monteur: De uitlaat is in prima staat");
		}
		if (kosten == 0) {
			System.out.println("Ik heb niks gedaan, dus dat was gratis!");
		}
		else {
			System.out.println("Dat is dan €"+kosten+" alstublieft");
		}
	}
}

class Auto {
boolean motor;
boolean deur;
boolean voorruit;
boolean uitlaat;
	
	Auto(boolean kapotmotor, boolean kapotdeur, boolean kapotvoorruit, boolean kapotuitlaat) {
		System.out.println("Autootje komt de garage binnen");
		motor = kapotmotor;
		deur = kapotdeur;
		voorruit = kapotvoorruit;
		uitlaat = kapotuitlaat;
	}
}


	


