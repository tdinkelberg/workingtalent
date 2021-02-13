package workingtalent;

public class Opdracht8 {
	public static void main(String[] args) {
		System.out.println("Hallo!");
		System.out.println("Hier komt opdracht8:");
		Boot boot1 = new Boot();
		Boot boot2 = new Speedboot();
		System.out.println("Eerst gaat de kapitein varen in zijn gewone boot");
		Kapitein.varen(boot1);
		System.out.println("Daarna gaat de kapitein varen in zijn gewone boot");
		Kapitein.varen(boot2);
	}
}

class Boot{
boolean motorgeluid;
	void starten() {
		System.out.println("kapitein: Ik ga lekker een stukje varen");
	}
}

class Speedboot extends Boot{
	void starten() {
		System.out.println("kapitein: IK ZET EVEN MIJN PET AF!");
	}
}

class Kapitein{
	static void varen(Boot boot){
		boot.starten();
		}
}
