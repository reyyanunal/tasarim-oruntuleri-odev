# Yazılım Tasarım Örüntüleri - Faz 1

Bu fazda, koddaki if-else bloklarından kaynaklı oluşan nesne oluşturma sorununa çözüm olarak Factory Method uygulanmıştır.

Kodda hesaplaVeYazdir() metodu içerisinde kullanıcı türü ve ödeme seçenekleri kısmında çok sayıda if-else bloğu yer almaktaydı. Sorunu çözmek amacıyla bu kod blokları yerine IndirimFabrikasi ve OdemeFabrikasi sınıfları oluşturularak nesne oluşturma işlemi bu sınıflara devredilmiştir.

Sonuç olarak ana kod, somut sınıflara bağlı olmaktan kurtuldu. Yeni bir indirim türü veya ödeme seçeneği ekleneceği senaryolarda mevcut kodu değiştirmek yerine yeni bir sınıf ekleyip fabrika sınıflarını güncellemek yeterli hale getirildi.