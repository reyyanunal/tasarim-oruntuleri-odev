
public class OgrenciIndirimi implements IndirimStratejisi {

	@Override
	public double indirimHesapla(double tutar) 
	{
		System.out.println("Öğrenci indirimi uygulandi (%10).");
	
		return tutar*0.90;
	}

}
