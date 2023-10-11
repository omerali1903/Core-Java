package Introduction.day28Interface;


public interface Animal {

    void eat();

    void drink();

    //1)interface'lerdeki tum variable'lar otomatik olarak final (deger alir ama bidaha degistiremezsin)
    //  bu yuzden interface icindeki variable'i olusturdugunuzda mutlaka deger atamasi yapmalisiniz
    //  Bilindigi gibi final variable'larin degerleri degistirilemez.
    //2)interface'deki tum variable'lar otomatik olarak "public"'tir o yuzden yazmamiza gerek yok java zaten public olarak algilar.
    //3)interface'deki tum variable'lar otomatik olarak "static"'tir.o yuzden yazmamiza gerek yok java zaten static olarak algilar.
    int age = 4;



}
