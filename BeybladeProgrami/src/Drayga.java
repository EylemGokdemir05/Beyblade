
public class Drayga extends Beyblade {
	private String kutsal_canavar;
	public Drayga(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsal_canavar) {
		super(beybladeci, donus_hizi, saldiri_gucu);
		this.kutsal_canavar=kutsal_canavar;
	}
	@Override
	public void kutsalcanavariortayacikar() {
		System.out.println(getBeybladeci()+" "+kutsal_canavar+" 'y� ortaya ��kar�yor..");
		System.out.println(getBeybladeci()+" '�n sald�r�s�: Kaplan Pen�esi");
	}
	@Override
	public void bilgileri_goster() {
		super.bilgileri_goster();
		System.out.println("Kutsal canavar ad�:"+kutsal_canavar);
	}
	

}
