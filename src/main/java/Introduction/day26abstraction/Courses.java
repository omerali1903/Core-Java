package Introduction.day26abstraction;
/*
    1) Bazen parent class'daki method'un body'si hicbir child class tarafindan kullanilmaz
    Bu durumda parent'daki method'a body yazmak hic kullanilmadigi icin mantikli degildir.
    Biz de o method'a body yazmayiz.
    2)Body'si yazilmayan method'a "Abstract Method" denir.
    Abstract Ingilizce'de "vucutsuz" veya "soyut" anlamindadir
    3)Method'un body'sini yazmayinca Java hata verir, biz de "abstract"
    keyword'unu kullanarak Java'ya bu method'un body'si olmayacak deriz.
    4)"abstract" keywordunu kullaninca elde ettigimiz abstract method normal class'lara konulamaz.
    o yuzden class'i da "abstract" yapariz.
    5)Parent'taki method abstract ise butun child class'lar o method'u override etmek zorundadir
    Bu yuzden tum child'lar icin mecburi olmasini istedigimiz fonksiyonlari
    abstract yapmak mantikli bir secimdir.
    6)Body'si olan method'lar (Concrete Method) abstract class'larin icine yazilabilir.
    abstract method'lar concrete class'larin icine yazilamazlar.
    7)"abstract" keyword ile "method body" bir method'da ayni anda kullanilamaz
    8)Abstract classların içinde abstract methodlar olur abstract methodlar bodysi olmadıgı için eksik methodlar olarak düşünülebiir
      Yani abstract class içinde eksik bir yapı barındırır siz abstract classdan obje üretirseniz abstract classın eksikliği objeye yansır
      Java bunu istemez çünkü eksik obje eksik iş yapar.
      Yanlış çalışmasına sebep olur
      Java aplicationu korumak için abstract classlardan obje üretilmesini engellemiştir.
      9)"abstract class" larin constructor'i vardir ama object olusturamazlar.


      10) "final method"lar "abstract" olamazlar.

      11) "private method"lar abstract olamazlar.
 */


/*
    "final" keyword'u aciklar misiniz?
    "final" keyword i)variable'larda   ii)method'larda        iii)class'larda kullanilir.

    i)variable'larda kullanildiginda a)O variable'a kesinlikle deger atamasi yapilmalidir
                                     b)Ilk atanan deger degistirilemez.

   ii)method'larda kullanildiginda  a)O method'un body'si degistirilemez
                                    b)O method override edilemez

  iii)class'larda kullanildiginda a)O class'in child class'i olamaz ama final class'in kendisi child olabilir

 */
public abstract class Courses {

public abstract void math();

   public void art(){

       System.out.println("Learn art");
   }


   public final double pi = 3.14;



}
