
public class OdemeFabrikasi {
	public static OdemeYontemi getOdeme(int tip) 
	{
        if (tip == 2) return new KrediKartiOdeme();
        
        if (tip == 3) return new HavaleOdeme();
        
        return new NakitOdeme();
    }

}
