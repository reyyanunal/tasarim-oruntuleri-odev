
public class KrediKartiOdeme implements OdemeYontemi{

	@Override
	public double odemeHesapla(double tutar) 
	{
		System.out.println("Kredi karti, tutara %2 komisyon eklendi");
		return tutar+(tutar*0.02);
	}

}
