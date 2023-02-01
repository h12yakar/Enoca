# Enoca

## MVC kavramını açıklar mısınız ? Neden ihtiyaç duyuluyor. Java’da nasıl kurgulanıyor. Object Oriented katmanları nelerdir?

- MVC, Model-View-Controller (Model-Görünüm-Kontrolör) kısaltmasıdır ve bir yazılım mimarisi desenidir. Bu desen, bir yazılım sisteminde verilerin (Model), 
kullanıcı arayüzünün (View) ve veriler ile arayüz arasındaki etkileşimin (Controller) ayrı ayrı yönetildiği bir yapıyı tanımlar.

- MVC'nin ihtiyaç duyulması, bir yazılım sisteminin büyüklüğü ve karmaşıklığı arttıkça, verilerin, kullanıcı arayüzünün ve arayüz ile veriler arasındaki 
etkileşimin ayrı ayrı yönetilmesini kolaylaştırır. Bu, yazılımın daha iyi okunabilir, test edilebilir ve bakımı kolay hale gelmesini sağlar.

- Java'da MVC, Java Servlet ve Java Server Pages (JSP) teknolojileri kullanılarak kurgulanabilir. Object Oriented katmanları, MVC yapısında Model, View ve Controller katmanlarını tanımlar. Model katmanı, verileri ve verilerle ilgili işlemleri tanımlar. View katmanı, kullanıcı arayüzünü tanımlar ve verileri ekrana yansıtır. Controller katmanı, veriler ile arayüz arasındaki etkileşimi yönetir ve verilerin görüntülenmesini kontrol eder.

##

## Birbirinden bağımsız iki platformun birbiriyle haberleşmesi nasıl sağlanabilir. Örneğin, X platformu Java ile yazılmış olsun, Y platform u C# ile. Bu iki platformun bir biri ile iletişim halinde request-response ilişkisi kurması gerekiyor. Bu yapıyı nasıl sağlarız?

- Web Servisleri: X platformu tarafından yapılan isteklere yanıt vermek için Y platformu tarafından bir web servisi oluşturulabilir. Bu web servisi, X platformu tarafından çağrılan API (Application Programming Interface) metodları aracılığıyla iletişim kurabilir.

- Message Queue (Mesaj Kuyruğu): X platformu tarafından gönderilen mesajlar, Y platformu tarafından okunabilir ve cevaplanabilir. Bu, RabbitMQ, Apache Kafka gibi mesaj kuyruğu yazılımları kullanılarak gerçekleştirilebilir.

- TCP/IP Soketleri: X ve Y platformları arasında direk bir bağlantı kurmak için TCP/IP soketleri kullanılabilir. Bu yapı, her platformda bir soket sunucusu ve bir soket istemcisi oluşturmak suretiyle gerçekleştirilir.

- 	REST (Representational State Transfer): X platformu tarafından yapılan HTTP isteklerine yanıt vermek için Y platformu tarafından bir REST servisi oluşturulabilir. Bu, HTTP protokolü kullanılarak gerçekleştirilir ve JSON veya XML gibi veri biçimleri kullanılabilir.

##

## Bir web sayfasında ekran sürekli Backend’ den veya bir başka yapı tarafından güncelleniyor. Siz, web sayfasını refresh etmeden bu güncel bilgiyi anlık ekrana nasıl yansıtırsınız.

Bu güncel bilgi anlık olarak ekrana yansıtmak için "Ajax" veya "WebSocket" teknolojisi kullanılabilir. Ajax, asenkron veri istemi yapabilen bir teknolojidir ve sunucu tarafından gelen verileri sayfa yenilemeden güncellemeyi sağlar. Bu, JavaScript ve XML kullanılarak gerçekleştirilir. Alternatif olarak, "WebSockets" teknolojisi de kullanılabilir, ancak bu daha gelişmiş bir teknolojidir ve daha fazla kodlama gerektirir.
WebSocket ile tanımı genişletip bu işlemi sıralayıp bir kod örneği ile anlatırsak;

- Sunucu tarafında WebSocket protokolünü destekleyen bir sunucu yapısı (örneğin, Node.js, Java, Python) kurulmalıdır.
- İstemci tarafında, JavaScript kodu ile WebSocket nesnesi oluşturulmalıdır.
- Sunucu ve İstemci arasında bir bağlantı kurulmalıdır.
- Sunucu tarafındaki değişiklikler anlık olarak istemci tarafındaki WebSocket nesnesine yansıtılmalıdır.
- İstemci tarafında, WebSocket nesnesi tarafından alınan veriler anlık olarak ekranda güncellenmelidir.

Örnek olarak JS kodu ile gösterirsek.

// WebSocket nesnesi oluşturma
var socket = new WebSocket("ws://localhost:8080/websocket");

// Bağlantı açıldığında yapılacaklar
socket.onopen = function () {
  console.log("Bağlantı açıldı.");
};

// Veri gelince yapılacaklar
socket.onmessage = function (event) {
  document.getElementById("data").innerHTML = event.data;
};

// Bağlantı kapandığında yapılacaklar
socket.onclose = function () {
  console.log("Bağlantı kapandı.");
};

##

## Bir for döngüsü ile aşağıdaki çıktıyı yazar mısınız?
istenilen çıktı:


public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }}

##

##  Firmada çalışman için sana remote bir linux server verildi. Elinde ip adresi port bilgisi kullanıcı adi ve şifren var. Server a erişimi nasıl test edersin, Server a nasıl erişirsin, Server'a nasıl dosya atarsın, Serverdan nasıl dosya çekersin?

Bu soruya iki farklı yöntem ile cevap verirsek;
ilk yöntem Linux Terminalden SSH ile bağlanıp Server test ve dosya aktarım işlemi yaparız. Diğer bir yöntem ise PuTTY vb. uygulamalar ile bağlanıp gerekli istemleri gerçekleştirebiiliriz.

### Terminal pencerisinden SSH kullanarak;

- ssh <kullanıcı_adı>@<ip_adresi> -p <port> 
// Eğer doğru kullanıcı adı, şifre ve bağlantı detayları verilmişse, Linux server'a bağlanabiliriz.
- scp <dosya_adı> <kullanıcı_adı>@<ip_adresi>:<hedef_dizin> -p <port> 
// Linux server'a dosya atmak ve dosya çekmek için "scp" (Secure Copy) kullanabiliriz.

### PuTTY yöntemi ile bağlanma ve dosya aktarım işlemleri için ise
  
- Bağlanmak istediğimiz server'ın IP adresini ve port numarasını girerek Bağlantı sekmesine geçip "Bağlantı Türü" "SSH" seçip "Bağlan" diyerek bağlantı kurarız.
- Bağlantı kurulduktan sonra karşınıza kullanıcı adı ve şifre girebileceğiniz bir ekran çıkacak. Kullanıcı adı ve şifreyi doğru girdikten sonra, server'a erişmiş olacağız.
- SFTP ile dosya transferi yapmak için, komut satırında "sftp [kullanıcı adı]@[IP adresi]" komutunu çalıştırın ve kullanıcı adı ve şifreyi girerek giriş yaparız.
- Dosya göndermek için "put [dosya ismi]" komutu, dosya çekmek için "get [dosya ismi]" komutu kullanmamız yeterli olacaktır.
  
##
  
## İstenilen Spring projesi "Backend-Challenge" olarak repoya eklenmiştir. 
  
  
## Proje 

  - JDK = jdk-17.0.1
  - Spring Boot Project : Maven/ Spring Boot:3.0.2
  - Dependencies : 
              - Spring Web
              - Spring Data JPA
              - PostgreSQL Driver
              - Lombok

  - PostgreSQL : 
              - Veri Tabanı Adı : "calisan" pass:"12345"
              - Column : /id, /adSoyad, /firma

  - Postman :  http://localhost:8080/calisan 
  
Conttroller.java  
Bu sınıfta notta belirtilen istemleri dökümante edersek, @RestController ve @RequestMapping("/calisan") anotasyonları ile tanımlanmıştır. Anotasyonlar, bu sınıfın HTTP istekleri için REST API endpointi olarak çalışacağını ve /calisan URL'i ile erişileceğini belirtiriz.

Ayrıca bu sınıf Calisan sınıfının nesnesini injekte etmek için @Autowired anotasyonunu kullanır. Calisan sınıfı veritabanı işlemlerini yapacak ve burada yapılan isteklere göre bu işlemleri gerçekleştiririz.

Controller sınıfı, 5 HTTP metodunu (GET, POST, PUT, DELETE) içeren 4 farklı endpoint tanımlar.

- @GetMapping: Tüm Calisan nesnelerini döndüren bir endpoint tanımlar.
- @PostMapping: Yeni bir Calisan nesnesi eklemek için kullanılan bir endpoint tanımlar.
- @PutMapping: Var olan bir Calisan nesnesinin güncellenmesi için kullanılan bir endpoint tanımlar.
- @DeleteMapping("/{id}"): ID'si verilen bir Calisan nesnesinin silinmesi için kullanılan bir endpoint tanımlar.
  
##
  
## - Apache Solr servisine yazılacak bir query örneği Apache Solr kullanılan sql programlarından daha farklı runtime bir database. Solr a hali hazırda kayıtlı bir alan olduğunu düşünelim. Alanın ismi “updatedAt” long tipinde tutulan bir alan. Ben 2020 Ocak ayından sonraki verileri getir dediğimde solr a nasıl bir query yazılmalı. http://example?query= kısmını nasıl doldurmalıyım?
  

"updatedAt" adlı alanı 2020 Ocak ayından sonraki verileri istenilen şekilde doldurup getirmek için aşağıdaki gibi bir sorgu yazabilir
  - http://example?q=updateAt:[2020-01-01T00:00:00Z TO *]

  - http://<solr_host>:<solr_port>/solr/<core_name>/select?q=updatedAt:[20200101 TO *]
  
Yukarıdaki sorguda, <solr_host> ve <solr_port> Solr sunucusunun host adresi ve port numarasıdır, <core_name> ise Solr çekirdeğinin adıdır. q parametresi, SOLR-QL sorgusunu içerir. updatedAt alanı için belirtilen değer aralığı 20200101 ve * arasındadır, bu nedenle sadece 2020 Ocak ayından sonra oluşturulan veriler döndürülecektir.

##
  Saygılarımla.
  Habip Yakar











