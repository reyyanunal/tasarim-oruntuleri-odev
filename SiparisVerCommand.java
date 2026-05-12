public class SiparisVerCommand implements ICommand 
{
    private SiparisFacade facade;
    private double tutar;
    private int tur;
    private int odeme;
    private int hediye;
    private int kargo;

    public SiparisVerCommand(SiparisFacade facade, double tutar, int tur, int odeme, int hediye, int kargo) 
    {
        this.facade = facade;
        this.tutar = tutar;
        this.tur = tur;
        this.odeme = odeme;
        this.hediye = hediye;
        this.kargo = kargo;
    }
    @Override
    public void calistir() 
    {
        facade.siparisiTamamla(tutar, tur, odeme, hediye, kargo);
    }
}