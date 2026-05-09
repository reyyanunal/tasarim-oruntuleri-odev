AI'a ne sordum?
-Kodumdaki kullanıcı türüne göre indirim ekleme durumunda if- else kirliliğini fark ettim ve buna çözüm olarak aklımda Factory Method var fakat sence kodumdaki bu sorun için en uygun Creational örüntülerden (abstract factory,builder,Prototype,singleton)hangisi daha uygun olur?

AI ne cevapladı?
-AI da aynı şekilde koddaki if-else sorunu için Factory methodun diğerlerine göre daha uyumlu olduğu, builder ve abstractın şuanki koduma göre gereksiz karmaşık klaacağını, singletonun ise kullanımının bulduğum problemi doğrudan çözemeyeceğini ekledi.

Ben ne uygulayacağım, neden aynı?
-Kodumdaki sorunlardan creational örüntüler ile çözülebilecek olduğunu düşündüğüm if-else fazlalığı için soyut sınıf,arayüz açmanın kodun geliştireblirliği açısından daha doğru olduğunu bunu da factory method ile yapabileceğimi düşünüyorum.
-Not: Aynı nesne oluşturma sorunu ödeme yöntemleri kısmında da olduğu için Factory methodu her iki yapıya da uygulayacağım.