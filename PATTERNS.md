# Yazılım Tasarım Örüntüleri - Faz 1

Bu fazda, koddaki if-else bloklarından kaynaklı oluşan nesne oluşturma sorununa çözüm olarak Factory Method uygulanmıştır.

Kodda hesaplaVeYazdir() metodu içerisinde kullanıcı türü ve ödeme seçenekleri kısmında çok sayıda if-else bloğu yer almaktaydı. Sorunu çözmek amacıyla bu kod blokları yerine IndirimFabrikasi ve OdemeFabrikasi sınıfları oluşturularak nesne oluşturma işlemi bu sınıflara devredilmiştir.

Sonuç olarak ana kod, somut sınıflara bağlı olmaktan kurtuldu. Yeni bir indirim türü veya ödeme seçeneği ekleneceği senaryolarda mevcut kodu değiştirmek yerine yeni bir sınıf ekleyip fabrika sınıflarını güncellemek yeterli hale getirildi.

# Yazılım Tasarım Örüntüleri - FAZ 2

-Bu fazda, kodda mevcut sepet yapısını bozmadan yeni özellikler ekleme sürecinde yaşanabilecek sorunları önlemek amacıyla Decorator Pattern uygulanmıştır. 
ISepet arayüzü üzerinden SepetDecorator sınıfı oluşturuldu. Bu sınıf sayesinde yeni özellikler eklenmesi durumunda sınıf sayısının ve bağımlılıkların artmasının önüne geçilmiştir. Böylece kalıtım yerine daha esnek ve geliştirilebilir bir kod yapısı oluşturulmuştur.

-Ayrıca bu fazda, mevcut kodun main sınıfının işlemlerin gerçekleşebilmesi için birçok sınıfı ayrı ayrı çağırması ve ileride gereğinden fazla büyüme durumuyla karşı karşıya kalması Facade Pattern ile önlenmiştir.
SiparisFacade sınıfı ile mainin çağırdığı tüm altsistemlerin etkileşimi tek bir merkezde toplanmıştır. Böylelikle istemci karmaşık kod yapısından  kurtarılmıştır.