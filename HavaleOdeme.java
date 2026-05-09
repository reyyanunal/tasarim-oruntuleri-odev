
public class HavaleOdeme implements OdemeYontemi{

	@Override
	public double odemeHesapla(double tutar) 
	{
		System.out.println("Havale, tutara %1 indirim uygulandi");
		return tutar-(tutar * 0.01);
	}

}
