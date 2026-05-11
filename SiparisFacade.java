public class SiparisFacade {
	
        public void siparisiTamamla(double tutar, int tur, int odeme, int hediye, int kargo) 
        {
        
        ISepet sepet = new TemelSepet(tutar);
        
        if (hediye == 1) 
        {
            sepet = new HediyePaketiDecorator(sepet);
        }
        if (kargo == 1) 
        {
            sepet = new HizliKargoDecorator(sepet);
        }
        
        double guncelTutar = sepet.getTutar();
        System.out.println("Sepet Detayı: " + sepet.getAciklama());
        
        IndirimStratejisi indirim = IndirimFabrikasi.getIndirim(tur);
        double sonFiyat = indirim.indirimHesapla(guncelTutar);
        
        if (guncelTutar > 1000) 
        {
            System.out.println("1000 TL üstü EKSTRA indirim (%5) eklendi.");
            sonFiyat *= 0.95;
        }
        
        OdemeYontemi secilenOdeme = OdemeFabrikasi.getOdeme(odeme);
        sonFiyat = secilenOdeme.odemeHesapla(sonFiyat);
        System.out.println("Toplam Odenecek Tutar: " + sonFiyat + " TL\n");
    }
}
