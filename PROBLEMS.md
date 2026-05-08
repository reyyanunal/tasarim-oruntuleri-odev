BENİM BULDUKLARIM:
Sorun 1: Her işlem tek bir sınıf içerisinde gerçekleştirilmiştir.
Açıklama: Bu durum bir sınıfın her şeyi kontrol etmeye çalışmasına; uzun, karmaşık kodlar oluşmasına sebep olacaktır. Bu durum kodun ileride yönetilemez hale gelmesine neden olabilir. SOLID Prensiplerinden Single Responsibility(Tek sorumluluk) ihlalidir.
Çözüm: Single Responsibility (Tek Sorumluluk) prensibi uyarınca her sorumluluğun farklı sınıflara alınması gerekir.

Sorun 2: Her işlem tek bir metot içerisinde yazılmıştır.
Açıklama: Hesaplama,ödeme seçeneği ve bilgilendirme işlemleri tek bir methodda bulunmakta bu da karmaşık, uzun, değiştirilmesi, geliştirilmesi zor metot sorununu doğurmaktadır. SOLID Prensiplerinden yine Single Responsibility ihlalidir.
Çözüm: Single Responsibility (Tek Sorumluluk) prensibi uyarınca her işlem ayrı metotlarda tutulmalıdır.

Sorun 3: Kodda yoğun if-else kullanımı bulunmaktadır.
Açıklama: Bu durum kodun geliştirilebilirliğini engeller. Yeni bir indirim seçeneği veya ödeme seçeneği ekleme durumunda kodda uzun uzun değişiklik yapılmasına sebep olur. SOLID Prensiplerinden Open/Closed ihlalidir. 
Çözüm: Open/Closed prensibini uygulamak için her işlem adına ayrı sınıflar açılmalıdır. Arayüzler ve ayrı sınıflarla uzayıp giden if-else bloklarından kurtulabiliriz.

Sorun 4: Koddaki her sayi int değişkeni olarak elle yazılmıştır.
Açıklama: İlerleyen süreçte indirimlerin %5'ten %10'a çıkması gibi değiştirme durumlarında kod içerisinde tek tek değiştirilmesi gereken yerleri bulup güncellemek gerekir. SOLID Prensiplerinden Open/Closed ihlalidir.
Çözüm: Bu sayılar metot dışına çıkarılmalı, anlamlı isimlere sahip sabit (static final) değişkenlere atanmalıdır.

Sorun 5: Kodda her işlem aynı sınıf ve method içerisinde olduğu için işlemler birbirlerine bağlılık içermektedir.
Açıklama: Birindeki değişim diğerinde de değişikliğe sebep olabilmektedir. Bu da bağımlılıkların azaltılmasını hedefleyen tasarım prensiplerine (örneğin Dependency Inversion) uygun değildir.
Çözüm: Her işlem birbirinden soyutlama yoluyla ayrılmalıdır.


AI İLE KARŞILAŞTIRMA:

1-AI ilk olarak Open/Closed Prensibi ihlali olan if-else kirliliğine değinmiştir. Benim 3. sorunda bahsettiğim gibi yeni bir seçenek eklendiğinde oluşabilecek sorunları belirtmiş, aynı şekilde her işlem için farklı arayüzler ve sınıflar açılması gerektiğini savunmuştur. Ek olarak Strategy Pattern ile bu sorunun çözülebileceğini söylemiştir.

2-AI benim 1 ve 2. maddelerimde ayrı ayrı bahsetmiş olduğum 'sınıf ve metodun birden fazla iş yapması' sorununa değinmiştir. Single Responsibility prensibine aykırılık olarak bahsedip çözüm önerisi olarak işlemleri ayırmanın yanı sıra, katmanlı mimari ve Facade pattern kullanılabileceğini söylemiştir.

3-Bir sonraki hata olarak ise Magic number kullanımına değinmiştir. Benim sorun 4'te bahsetmiş olduğum soruna çözüm önerisi olarak enum kullanımından bahsetmiştir. Bu sayede kodun daha anlaşılır ve güvenli olacağını belirtmiştir.
Not: Ben güncelleme gerektiğinde zorluk yaratacağından kaynaklı Open-Closed ihlali demiştim fakat ai daha çok kodun okunabilirliğinin sıkıntısından bahsetmiştir.

4-Benim 5. maddede değinmiş olduğum bağımlılık konusuna da, kullanıcı girdisi ile iş mantığının iç içe olması başlığı altında değinmiştir. Sistemin test edilebilirliğinde, ileride Web uygulamasına dönüştürülmesinde ve yeniden kullanılabilmesi konusunda yaşanabilecek sorunları, MVC yaklaşımı ile çözülebileceğini anlatmıştır.

5-Benim bulduğum sorunlara ek olarak AI esnek olmayan indirim ve ücretlendirme zinciri konusuna değinmiştir. Ben daha çok işlemleri ayırarak yeni bir seçenek ekleme veya mevcut indirim oranını değiştirme ihtimaline odaklanmışken AI, indirimlerin uygulanma sırasının esnek olmamasına dikkat çekmiştir. İşlemlerin sıralarının dinamik olması için Decorator veya Chain of Responsibility örüntülerini eklemiştir.


