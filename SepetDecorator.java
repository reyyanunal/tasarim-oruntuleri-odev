
public abstract class SepetDecorator implements ISepet 
{
    protected ISepet dekoreEdilenSepet;

    public SepetDecorator(ISepet sepet) 
    {
        this.dekoreEdilenSepet = sepet;
    }

    @Override
    public double getTutar()
    {
        return dekoreEdilenSepet.getTutar();
    }

    @Override
    public String getAciklama() 
    {
        return dekoreEdilenSepet.getAciklama();
    }
}
