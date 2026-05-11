import java.util.Scanner;

public class SepetSistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("E-TICARET SEPETI\n");
        
        System.out.print("Ürünlerin toplam tutarını giriniz: ");
        double anaTutar = scanner.nextDouble();

        System.out.println("Kullanıcı Türü (1: Normal, 2: Öğrenci, 3: VIP): ");
        int kullaniciTur = scanner.nextInt();

        System.out.println("Ödeme Yöntemi (1: Nakit, 2: Kredi Kartı, 3: Havale): ");
        int odemeTur = scanner.nextInt();
        
        System.out.println("Hediye Paketi İster misiniz? (1: Evet, 0: Hayır): ");
        int hediye = scanner.nextInt();
        
        System.out.println("Hızlı Kargo İster misiniz? (1: Evet, 0: Hayır): ");
        int kargo = scanner.nextInt();
      
        hesaplaVeYazdir(anaTutar, kullaniciTur, odemeTur, hediye, kargo);
    }

    public static void hesaplaVeYazdir(double tutar, int tur, int odeme, int hediye, int kargo) 
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
        System.out.println("\nSepet Detayı: " + sepet.getAciklama());
                
    	IndirimStratejisi indirim = IndirimFabrikasi.getIndirim(tur);
        double sonFiyat = indirim.indirimHesapla(guncelTutar);
        
        if (guncelTutar > 1000) 
        {
            System.out.println("1000 TL üstü EKSTRA indirim (%5) eklendi.");
            sonFiyat *= 0.95;
        }
        
        OdemeYontemi secilenOdeme = OdemeFabrikasi.getOdeme(odeme);
        sonFiyat = secilenOdeme.odemeHesapla(sonFiyat);

        System.out.println("TOPLAM ÖDENECEK: " + sonFiyat + " TL\n");
    }
}