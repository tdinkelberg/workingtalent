package workingtalent;

public class Opdracht9 {
	public static void main(String[] args) {
		System.out.println("Hallo!");
		System.out.println("Hier komt opdracht9:");
	}
}
	
interface Vliegend{
	void opstijgen();
	void landen();
}
	
class Vliegtuig implements Vliegend{
	public void opstijgen() {
		System.out.println("Geeft gas");
	}
	public void landen() {
		System.out.println("Doet landingsgestel uit");	
	}
	
}

class Leeuw{

}

class Spreeuw implements Vliegend{
	public void opstijgen() {
		System.out.println("Klapt vleugels");
	}
	public void landen() {
		System.out.println("Spreidt zijn vleugels");	
	}
}