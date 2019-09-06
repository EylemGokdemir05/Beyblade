
public class Dranza extends Beyblade {
	private String kutsal_canavar;
	public Dranza(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsal_canavar) {
		super(beybladeci, donus_hizi, saldiri_gucu);
		this.kutsal_canavar=kutsal_canavar;
	}
	@Override
	public void kutsalcanavariortayacikar() {
		System.out.println(getBeybladeci()+" "+kutsal_canavar+" 'yý ortaya çýkarýyor..");
		System.out.println(getBeybladeci()+" 'ýn saldýrýsý: Alev Kýlýcý");
	}
	@Override
	public void bilgileri_goster() {
		super.bilgileri_goster();
		System.out.println("Kutsal canavar adý:"+kutsal_canavar);
	}
	

}
