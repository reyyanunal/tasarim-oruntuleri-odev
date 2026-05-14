
public class HizliKargoDecorator extends SepetDecorator {
    public HizliKargoDecorator(ISepet sepet) 
    {
        super(sepet);
    }

    @Override
    public double getTutar() 
    {
        return super.getTutar() + 50.0; 
    }

    @Override
    public String getAciklama() 
    {
        return super.getAciklama() + " + Hızlı Kargo";
    }
}
