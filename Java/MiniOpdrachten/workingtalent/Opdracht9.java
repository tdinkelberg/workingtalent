package workingtalent;

public class Opdracht9 {
	public static void main(String[] args) {
		Vliegtuig v1 = new Vliegtuig();
		Spreeuw s1 = new Spreeuw();
		Leeuw l1 = new Leeuw();
		
		Vliegend v2 = v1.maakVliegendObject();
		Vliegend s2 = s1.maakVliegendObject();
		
		// laat gemaakte objecten vliegen
		vliegen(v2);
		vliegen(s2);
		
		
		Dingen[] dingen = {v1, s1, l1};
		
		//probeer dingen te laten vliegen
		for (int i = 0 ; i < dingen.length ; i++) {
			if (dingen[i] instanceof Vliegend) {
				System.out.println(dingen[i].naam+" zegt: IK GA VLIEGEN!");
				Vliegend ding = (Vliegend) dingen[i];
				vliegen(ding);
			}
			else {
				System.out.println(dingen[i].naam+" zegt: Ik kan niet vliegen :(");
			}
		}
	}
	
	static void vliegen(Vliegend ding) {
		ding.stijgOp();
		System.out.println("Het object is nu aan het vliegen.");
	}
}

interface Vliegend{
	void stijgOp();
	Vliegend maakVliegendObject();
}

class Vliegtuig extends Dingen implements Vliegend{
	Vliegtuig() {
		naam = "vliegtuig";
	}
	public Vliegend maakVliegendObject() {
		System.out.println("Er is een nieuw vliegend vliegtuig gemaakt");
		return new Vliegtuig();
	}
	
	public void stijgOp() {
		System.out.println("Het vliegtuig geeft gas en stijgt op");
	}
}

class Spreeuw extends Dingen implements Vliegend{
	Spreeuw(){
		naam = "spreeuw";
	}
			
	public Vliegend maakVliegendObject() {
		System.out.println("Er is een nieuwe vliegende spreeuw geboren");
		return new Spreeuw();
	}
	
	public void stijgOp() {
		System.out.println("De spreeuw wappert met zijn vleugels en gaat de lucht in");
	}
}

class Leeuw extends Dingen{
	Leeuw(){
		naam = "leeuw";
	}
}

class Dingen{
	String naam;
}
