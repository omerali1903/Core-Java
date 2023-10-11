package Introduction.day27interface;
/*

                                INTERFACE METHODLARI
1)"interface"in icine "concrete method" konulamaz
2)"interface" icindeki methodlarin abstract oldugunu Java bilir, bu yuzden "interface" icindeki
  "abstract method" larda "abstract" keyword kullanmaya gerek yoktur.
3)"interface" icindeki "abstract method" larin tamami "public" dir.
   Bu yuzden "interface" icinde abstract method olustururken "access modifier" yazmaya gerek yoktur
4)Bir "interface" i bir "class" in parent'i yapmak istediginizde "extends" keyword yerine
  "implemets" keyword kullaniniz

  5) "Concrete Child "Class" ' lar "parent interface" daki "abstract method"lari override etmek zorundadirlar.
  6)"interface"'ler bir applicationda "Concrete child Class" 'larin yapmak zorunda olduklari
  fonksiyonlari barindirirlar. Bu yuzden "interface" lere "to-do list"'de denir.
  7)Birden fazla "parent-interface" icinde ayni isimli abstract method'lar olusturabilirsiniz.
    absract method'larin body'si olmadigi icin child class'lar ayni isimli method'lardan herhangi birini override ederek kullanabilirler.
  8)Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturdugunuzda bu method'larin "return type"'lari ayni olmak zorundadir.
  9) Normalde "interface" icine "concrete method" konulamaz ama bazi ozel durumlarda "concrete method"
koymamiz gerekirse
    i) "default" keyword unu asagidaki gibi kullanarak "interface" icine "concrete method"
    koyabiliriz. default void ceo () { System.out.println("Uses gas less...");}
    ii) "static" keyword unu asagidaki gibi kullanarak "interface" icine "concrete method"
    koyabiliriz. default void ceo () { System.out.println("Uses gas less...");}
    10)"default" veya "static" keyword'unu olusturdugunuz concrete methodla'in "concrete child class" lar tarafindan
   kullanilma zorunlulugu yoktur.
   11)"default" keyword'unu kullanarak olusturgunuz "concrete method"lara "object" olusturarak
   ulasilabilir.
   "static" keyword'unu kullanarak olusturgunuz "concrete method"lara ulasmak icin "object"
   olusturmaya gerek yoktur, "interface" ismi yeterlidir.
   12)Interface'lerden object olusturulamaz. "interface" lerin "constructor"i yoktur.

 */
public interface  Engine {


    void start();

    void payment();


    default void eco(){
        System.out.println("Uses gas less...");
    }

    static void stop(){

    }
}
