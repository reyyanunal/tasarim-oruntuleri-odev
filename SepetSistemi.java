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
      
        hesaplaVeYazdir(anaTutar, kullaniciTur, odemeTur);
    }
  
    public static void hesaplaVeYazdir(double tutar, int tur, int odeme)
  {

        IndirimStratejisi indirim = IndirimFabrikasi.getIndirim(tur);
        
        double sonFiyat = indirim.indirimHesapla(tutar);
        
        if (tutar > 1000) 
        {
            System.out.println("> 1000 TL üstü EKSTRA indirim (%5) eklendi.");
            sonFiyat = sonFiyat * 0.95; 
        }
    
        if (odeme == 2)
        { 
            sonFiyat = sonFiyat + (sonFiyat * 0.02);
            System.out.println("> Kredi kartı %2 komisyon eklendi.");
        } 
        else if (odeme == 3) 
        {
            sonFiyat = sonFiyat - (sonFiyat * 0.01);
            System.out.println("> Havale %1 indirimi uygulandı.");
        } 
        else 
        {
            System.out.println("> Nakit ödeme seçildi.");
        }
        System.out.println("\nTOPLAM ÖDENECEK: " + sonFiyat + " TL\n");
    }
}
