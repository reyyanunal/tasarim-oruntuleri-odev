Sorun 1: Her işlem tek bir sınıf içerisinde gerçekleştirilmiştir.
Açıklama: Bu durum bir sınıfın her şeyi kontrol etmeye çalışmasına; uzun, karmaşık kodlar oluşmasına sebep olacaktır.Bu durum kodun ileride yönetilemez hale gelmesine neden olabilir. SOLID Prensiplerinden Single Responsibility(Tek sorumluluk) ihlalidir.
Çözüm: Single Responsibility (Tek Sorumluluk) prensibi uyarınca her sorumluluğun farklı sınıflara alınması gerekir.

Sorun 2: Her işlem tek bir method içerisinde yazılmıştır.
Açıklama: Hesaplama,ödeme seçeneği ve bilgilendirme işlemleri tek bir methodda bulunmakta bu da karmaşık, uzun, değiştirilmesi, geliştirilmesi zor method sorununu doğurmaktadır. SOLID Prensiplerinden yine Single Responsibility ihlalidir.
Çözüm: Single Responsibility (Tek Sorumluluk) prensibi uyarınca her işlem ayrı methodlarda tutulmalıdır.

Sorun 3: Kodda yoğun if-else kullanımı bulunmaktadır.
Açıklama: Bu durum kodun geliştirilebilirliğini engeller. Yeni bir indirim seçeneği veya ödeme seçeneği ekleme durumunda kodda uzun uzun değişiklik yapılmasına sebep olur. SOLID Prensiplerinden Open/Closed ihlalidir. 
Çözüm: Open/Closed prensibini uygulamak için her işlem adına ayrı sınıflar açılmalıdır. Arayüzler ve ayrı sınıflarla uzayıp giden if-else bloklarından kurtulabiliriz.

Sorun 4: Kodda ki her sayi int değişkeni olarak elle yazılmıştır.
Açıklama: İlerleyen süreçte indirimlerin %5'ten %10'a çıkması gibi değiştirme durumlarında kod içerisinde tek tek değiştirilmesi gereken yerleri bulup güncellemek gerekir. SOLID Prensiplerinden Open/Closed ihlalidir.
Çözüm: Bu sayılar metot dışına çıkarılmalı, anlamlı isimlere sahip sabit (static final) değişkenlere atanmalıdır.

Sorun 5: Kodda her işlem aynı sınıf ve method içerisinde olduğu için işlemler birbirlerine bağlılık içermektedir.
Açıklama: Birindeki değişim diğerinde de değişikliğe sebep olabilmektedir. Bu da bağımlılıkların azaltılmasını hedefleyen tasarım prensiplerine (örneğin Dependency Inversion) uygun değildir.
Çözüm: Her işlem birbirinden soyutlama yoluyla ayrılmalıdır.
