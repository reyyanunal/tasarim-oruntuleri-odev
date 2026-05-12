public class SMSBildirimcisi implements IBildirimGozlemcisi 
{
    @Override
    public void guncelle(String mesaj) 
    {
        System.out.println("SMS Gönderildi: " + mesaj);
    }
}
