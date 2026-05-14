public class TemelSepet implements ISepet {
    private double tutar;

    public TemelSepet(double tutar) 
    {
        this.tutar = tutar;
    }

    @Override
    public double getTutar() 
    {
        return this.tutar;
    }

    @Override
    public String getAciklama() 
    {
        return "Sepet (Standart)";
    }
}
