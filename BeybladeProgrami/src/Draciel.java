
public class Draciel extends Beyblade {
	private String kutsal_canavar;
	public Draciel(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsal_canavar) {
		super(beybladeci, donus_hizi, saldiri_gucu);
		this.kutsal_canavar=kutsal_canavar;
	}
	@Override
	public void kutsalcanavariortayacikar() {
		System.out.println(getBeybladeci()+" "+kutsal_canavar+" 'yý ortaya çýkarýyor..");
		System.out.println(getBeybladeci()+" 'ýn savunmasý: Kale Savunmasý");
	}
	@Override
	public void bilgileri_goster() {
		super.bilgileri_goster();
		System.out.println("Kutsal canavar adý:"+kutsal_canavar);
	}
	

}
