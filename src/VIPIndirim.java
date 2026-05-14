
public class VIPIndirim implements IndirimStratejisi{

	@Override
	public double indirimHesapla(double tutar) 
	{
		System.out.println("VIP indirimi uygulandi (%20)");
		return tutar *0.80;
	}

}
