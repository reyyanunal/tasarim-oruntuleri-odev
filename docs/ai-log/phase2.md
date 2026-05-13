#AI'a ne sordum?
-Adapter pattern burada uygun mu, yoksa Facade mı? Farkını açıkla.
-Mevcut kod yapısı düşünüldüğünde Decorator ve Facade patternlerinin sisteme ne gibi katkıları olabilir?

#AI ne cevapladı?
-AI ilk sorunun cevabı olarak ilk farklarından bahsetmiştir: Adapter Pattern'in görevinin uyumsuz arayüzlerin birlikte çalışmasını sağlamak olduğunu, Facada Pattern'in görevinin ise Adapter'den bağımsız olarak uyumsuzluğu çözmek değil karmaşıklığı basitleştirmek olduğundan bahsetmiştir.
-Benim koduma hangisinin daha uygun olduğu konusunda sistemin şu an çok karmaşık olmadığını bu yüzden Facade Pattern'in zorunlu olmadığını belirtmiştir. Ancak ileride eklenecek bir veritabanı sistemi veya dış kargo servisi entegrasyonu gibi durumlarda Adapter Pattern’in tercih edilebileceği söylemiştir.

-İkinci sorunun cevabı olarak kodun sürdürebilirliği ve geliştirilebilirliği açısından fayda sağlayabileceğini belirtmiştir. Decorator Pattern'in, yeni eklenebilecek indirim davranışlarında mevcut sınıfları değiştirmeden mümkün kılacağından; Facade Pattern’in karmaşık işlemleri tek bir merkezden yöneterek sistemi sadeleştirebileceğini belirtmiş, bu durumun da istemcinin işini kolaylaştıracağından bahsetmiştir.

#AI'de neye katılmadım, ben ne yapacağım?
-AI'ye Adapter Pattern tercihi konusunda katılmamaktayım, kodun mevcut durumunda main sınıfının işlemleri tamamlamak adına birçok sınıfı tek tek çağırmasının bir sorun olduğunu düşünmekteyim. Tüm bu sınıfları Facade örüntüsü ile tek bir merkez altında yönetip main sınıfının daha temize çıkması sağlanmalıdır. 
-Adapter Pattern'in mevcut sistem için gereksiz kalacağını düşünüyorum. Olmayan bir sistem adına pattern uygulamaktansa olan mevcut sorunlar için Decorator Pattern'i uygulamak daha faydalı olacaktır. Böylelikle sisteme yeni özellikler eklemek daha kolay olacaktır.
-PROBLEMS.md dosyasında da AI ile olan konuşmalarımızda önermiş olduğu Decorator ve Facade örüntülerinin kodun geliştirilebilirliğini artıracağını düşünmekteyim.


