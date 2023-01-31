# Enoca

## MVC kavramını açıklar mısınız ? Neden ihtiyaç duyuluyor. Java’da nasıl kurgulanıyor. Object Oriented katmanları nelerdir?
- MVC, Model-View-Controller (Model-Görünüm-Kontrolör) kısaltmasıdır ve bir yazılım mimarisi desenidir. Bu desen, bir yazılım sisteminde verilerin (Model), kullanıcı arayüzünün (View) ve veriler ile arayüz arasındaki etkileşimin (Controller) ayrı ayrı yönetildiği bir yapıyı tanımlar.
- MVC'nin ihtiyaç duyulması, bir yazılım sisteminin büyüklüğü ve karmaşıklığı arttıkça, verilerin, kullanıcı arayüzünün ve arayüz ile veriler arasındaki etkileşimin ayrı ayrı yönetilmesini kolaylaştırır. Bu, yazılımın daha iyi okunabilir, test edilebilir ve bakımı kolay hale gelmesini sağlar.
- Java'da MVC, Java Servlet ve Java Server Pages (JSP) teknolojileri kullanılarak kurgulanabilir. Object Oriented katmanları, MVC yapısında Model, View ve Controller katmanlarını tanımlar. Model katmanı, verileri ve verilerle ilgili işlemleri tanımlar. View katmanı, kullanıcı arayüzünü tanımlar ve verileri ekrana yansıtır. Controller katmanı, veriler ile arayüz arasındaki etkileşimi yönetir ve verilerin görüntülenmesini kontrol eder.


## Birbirinden bağımsız iki platformun birbiriyle haberleşmesi nasıl sağlanabilir. Örneğin, X 
platformu Java ile yazılmış olsun, Y platform u C# ile. Bu iki platformun bir biri ile iletişim 
halinde request-response ilişkisi kurması gerekiyor. Bu yapıyı nasıl sağlarız
