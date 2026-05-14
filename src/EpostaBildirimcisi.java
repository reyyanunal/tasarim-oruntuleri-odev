public class EpostaBildirimcisi implements IBildirimGozlemcisi {
    @Override
    public void guncelle(String mesaj) 
    {
        System.out.println("E-posta Gönderildi: " + mesaj);
    }
}
