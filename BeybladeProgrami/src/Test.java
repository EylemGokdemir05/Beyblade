import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Beyblade programýna hoþgeldiniz..");
		System.out.println("Çýkýþ için x'e basýn.");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("Üretilecek beyblade:");
			String islem=scanner.nextLine();
			if(islem.equals("x")) {
				System.out.println("Programdan çýkýlýyor..");
				break;
			}
			else {
				BeybladeFabrikasi beybladeFabrikasi=new BeybladeFabrikasi();
				Beyblade beyblade=beybladeFabrikasi.beyblade_uret(islem);
				if(beyblade==null) {
					System.out.println("Geçersiz beyblade!");
				}
				else {
					beyblade.bilgileri_goster();
					beyblade.saldir();
					beyblade.kutsalcanavariortayacikar();
				}
			}
		}

	}

}
