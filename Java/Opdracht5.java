package workingtalent;

public class Opdracht5 {
	public static void main(String[] args) {
		System.out.println("Hallo!");
		System.out.println("Hier komt opdracht5:");
		
		// Wat is er kapot?
		boolean kapotmotor = true;
		boolean kapotdeur = true;
		boolean kapotvoorruit = true;
		boolean kapotuitlaat = true;
		Auto auto1 = new Auto();
		Auto auto2 = new Auto({kapotmotor, kapotdeur, kapotvoorruit, kapotuitlaat}); // deze werkt niet????
		Monteur.repareren(auto1);
		Monteur.repareren(auto2);
	}
}

class Monteur {
	static void repareren(Auto auto) {
		int kosten = 0;
		if (auto.motor == true) {
			auto.motor = false;
			System.out.println("Monteur: Die motor ziet er niet zo goed uit, die zal ik even opknappen:");
			kosten = kosten +25;
		}
		if (auto.deur == true) {
			auto.deur = false;
			System.out.println("Monteur: Die deur ziet er niet zo goed uit, die zal ik even opknappen:");
			kosten = kosten +25;			
		}
		if (auto.voorruit == true) {
			auto.voorruit = false;
			System.out.println("Monteur: Die voorruit ziet er niet zo goed uit, die zal ik even opknappen:");
			kosten = kosten +25;			
		}
		if (auto.uitlaat == true) {
			auto.uitlaat = false;
			System.out.println("Monteur: Die uitlaat ziet er niet zo goed uit, die zal ik even opknappen:");
			kosten = kosten +25;			
		}
		System.out.println("Dat is dan €"+kosten+" alstublieft");
	}
}

class Auto {
boolean motor = true;
boolean deur = true;
boolean voorruit = true;
boolean uitlaat = true;
	Auto(){
		System.out.println("Autootje komt de garage binnen");
	}
	
	Auto(boolean kapotteonderdelen[]) {
		motor = kapotteonderdelen[1];
		deur = kapotteonderdelen[2];
		voorruit = kapotteonderdelen[3];
		uitlaat = kapotteonderdelen[4];
	
	}
}


	


