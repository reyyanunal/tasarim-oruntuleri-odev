
public class IndirimFabrikasi {
	public static IndirimStratejisi getIndirim(int tip) 
	{
        if (tip == 2) return new OgrenciIndirimi();
        
        if (tip == 3) return new VIPIndirim();
        
        return new NormalIndirim();
    }

}
