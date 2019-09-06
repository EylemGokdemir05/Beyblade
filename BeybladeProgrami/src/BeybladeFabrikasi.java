
public class BeybladeFabrikasi {
	public Beyblade beyblade_uret(String beyblade_turu) {
		if(beyblade_turu.equals("Dragon")) {
			return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal canavarla konu�mak");
		}
		else if(beyblade_turu.equals("Dranza")) {
			return new Dranza("Kai", 600, 400, "K�rm�z� Anka Ku�u");
		}
		else if(beyblade_turu.equals("Drayga")) {
			return new Drayga("Rei", 800, 250, "Beyaz Kaplan");
		}
		else if(beyblade_turu.equals("Draciel")) {
			return new Draciel("Max", 400, 1000, "Kara Kaplumba�a");
		}
		else {
			return null;
		}
	}

}
