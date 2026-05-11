
public class HediyePaketiDecorator extends SepetDecorator {
    public HediyePaketiDecorator(ISepet sepet)
    {
        super(sepet);
    }

    @Override
    public double getTutar() 
    {
        return super.getTutar() + 20.0; 
    }

    @Override
    public String getAciklama() 
    {
        return super.getAciklama() + " + Hediye Paketi";
    }
}