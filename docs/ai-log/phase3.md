# AI ILE PAIR PROGRAMMING

# AI'ya pair programming sürecinde ne sordum?
1- Mevcut sistem için Chain of Responsibility uygun mu, koddaki hangi kısımlar için kullanılabilir?
2-  Main sınıfında bağımlılıklar var hangi pattern bu bağımlılıkları azaltmayı amaçlar?
3- Command Pattern uygulamak sistemde nasıl bir etki bırakır?
4- Strategy Pattern'i Factory method uygularken uygulamış sayılır mıyız? Yeni bir sistem gerektirir mi?

# AI'ın cevaplari?
1- Projenin ilk AI konuşmasında PROBLEMS.md raporunda indirimlerin uygulamanma sırasının belli olmamasına takılması sonucu CoR patternin eklenebileceğini önermiş olduğu için bu soruyu sormuştum. Ancak mevcut sistemin karmaşık sorumluluk zinciri barındırmadığını, şuanki yapıda eklenecek bildirim sisteminin Open/Closed prensibine uyumlu olabilmesi için Observer Pattern'in uygulanmasını önermiştir.
2- Main sınıfındaki bağımlılıkları Facade Pattern ile çözebileceğimi tüm sistemleri tek bir çatı altında toplamanın kod için daha iyi olacağını savundu.
3- Başta küçük sayılabilecek bir proje için mevcut sisteme karmaşık bir yapı olacağından bahsetti. Ancak main sınıfının Facade sınıfına karşı sıkı bağlılığını azaltmak amacım sonucu Command Pattern uygulanması gerektiğine karar verildi.
4- Teorik olarak ikisinin farklı amaçlarda olmasına karşılık Factory methodu ile Strategy mantığını da koda yedirmiş olduğumuzu,yeni bir sistem gerektirmediğini açıkladı.

# AI olmasa bu faz ne kadar uzun sürerdi?
- AI olmasa süreç daha uzun sürerdi çünkü mevcut sistemdeki hatalara en uygun örüntüleri, hangisinin karmaşıklık yaratıp yaratmayacağını AI kullanımı ile daha çabuk keşfetmiş, onunla yaşadığım zıt düşmelerle de daha neyi neden seçtiğimi diğerlerini neden seçmemem gerektiğini daha iyi kavramış oldum.
- Bazı noktalarda ise AI'ın bağlamdan kopması, sistemdeki kusurları vurgulamak için kullanmış olduğum ifadelerin onun tarafından anlaşılmamış olması gibi durumlar ise yavaşlattı. AI kullanımında da AI'yı sıkı sıkıya denetlemek gerektiği sonucuna vardım.

# AI beni nerelerde yanılttı?
- Dediklerinin her zaman arkasında değil ve bazen çok büyük bir sorunmuş gibi bahsetmiş olduğu noktalara bir başka zaman üzerinde durulmaması gerektiğini söylemesi faz3'te uygulamam gereken patternler konusunda beni yanılgıya düşürdü.
- Main içinde ki karmaşıklık için Command Pattern kullanmayı düşünmem üzerine benimle mevcut kodun buna ihtiyacı olmadığını savundu. Ancak open/closed prensibi gereği eklenecek olan özellikler göz önünde bulunduğunda bu fazın sadece o anı kurtarmak yerine geleceğe hazırlık yapması gerektiğini düşündüm.

# Bu fazda neler öğrendim? 
- Behavioral örüntülerin amacının kod organizasyonundan çok, geliştirilebilirliğini desteklemek değiştirilmeyi engellemek olduğunu anladım. 
- Open/Closed prensibini gerçek bir örnek üzerinde uygulamanın sistem mimarisi açısından ne kadar gerekli olduğunu öğrendim.
- Factory method ile Strategy pattern in ne kadar benzer uygulama yöntemi olsa da ikisinin de farklı amaçlara hizmet ettiğini kavradım.