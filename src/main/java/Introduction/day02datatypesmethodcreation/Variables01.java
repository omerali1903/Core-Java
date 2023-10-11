package Introduction.day02datatypesmethodcreation;

public class Variables01 {
    /*
    Java`da temelde iki tip data vardir.
    1)primitive data type:
    char,boolean,byte,short,int,long,float,double
    2)non-primitive data type:
    String,
    Not 1 : primitive data type lari java olusturmustur,biz olusturamayiz
    Not 2 : primitive data type`larin isimlerinde sadece kucuk harf kullanilir
    Not 3 : primitive data`lar type `larina gore memory de farkli farkli yer kaplarlar
    Not 4 : primitive data`lar iclerinde sadece sizin atadiginiz degeri barindirirlar.
     */
    /*
    Non primitive Data Types
    Ornek olarak Strıng non-primitive bir data type`dir
    Uretilen her bir class ayni zamanda bir "non-primitive data type`dir"
    Bu yuzden "non-primitive data type`lar sinirsiz sayida`dir denilebilir
    Non-primitive data type`larin isimleri buyuk harfle baslar.
    Non-primitive data type`larin tamami icin java memory de ayni miktarda yer ayirir.

     */
    public static void main(String[] args) {


       //Ornek 1 Sehir ismi icin bir variable olusturun ve bir diger atayip onu ekrana yazdirin

        String sehirIsmi = "Kocaeli" ;

        System.out.println(sehirIsmi);

        /*
                  Interview sorusu : "primitive" ve "non primitive" data type`lar arasindaki fark nedir ?
                  1)"primitive" ler sadece bizim atadigimiz degeri icerir
                    "non-primitive" ler bizim atadigimiz deger ve method`lar icerir
                  2)"primitive" ler kucuk harfle baslar, "non-primitive ler" ler buyuk harfle baslar
                  3)"primitive" leri java uretmistir ve 8 tanedir
                    "non-primitive" leri java ve devoloperlar uretebilir, sinirsiz sayidadir.
                 4) "primitive" ler memory`de data type `ina gore yer kaplar
                   Non-primitive data type`larin tamami icin java memory de ayni miktarda yer ayirir.

         */





    }









}

