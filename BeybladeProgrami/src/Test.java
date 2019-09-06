import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Beyblade program�na ho�geldiniz..");
		System.out.println("��k�� i�in x'e bas�n.");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("�retilecek beyblade:");
			String islem=scanner.nextLine();
			if(islem.equals("x")) {
				System.out.println("Programdan ��k�l�yor..");
				break;
			}
			else {
				BeybladeFabrikasi beybladeFabrikasi=new BeybladeFabrikasi();
				Beyblade beyblade=beybladeFabrikasi.beyblade_uret(islem);
				if(beyblade==null) {
					System.out.println("Ge�ersiz beyblade!");
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
