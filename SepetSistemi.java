import java.util.Scanner;

public class SepetSistemi {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        SiparisFacade siparisYonetici = new SiparisFacade();
        
        System.out.print("Ürünlerin toplam tutarını giriniz: ");
        double anaTutar = scanner.nextDouble();

        System.out.println("\nKullanıcı Türü (1: Normal, 2: Öğrenci, 3: VIP): ");
        int kullaniciTur = scanner.nextInt();

        System.out.println("Ödeme Yöntemi (1: Nakit, 2: Kredi Kartı, 3: Havale): ");
        int odemeTur = scanner.nextInt();
        
        System.out.println("Hediye Paketi Eklensin mi? (1: Evet, 0: Hayır): ");
        int hediye = scanner.nextInt();
        
        System.out.println("Hızlı Kargo İster misiniz? (1: Evet, 0: Hayır): ");
        int kargo = scanner.nextInt();
        
        siparisYonetici.siparisiTamamla(anaTutar, kullaniciTur, odemeTur, hediye, kargo);
    }
}