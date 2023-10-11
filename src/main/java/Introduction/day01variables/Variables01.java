package Introduction.day01variables;

public class Variables01 {

    public static void main(String[] args) {
        // java bu satiri okumaz. Kendimize veya baskasina aciklamadir
        /*
        Java bu satirlari da okumaz
         */

        //Variable olusturma
        // data type + variable name + atama operatoru + data + noktali virgul
            int             age              =            13         ;
         //   Variable Declaration                   Assignment

        // Java  cumlesi ==> Statement
        //Data type + Variable Name ==> Variable Declaration
        //Assingment Operator (atama operatoru) + Variable degeri ==> Assignment
        // Eger variable Decleration yapar,assignment yapmazsaniz Java kendi degerlerini (default ==>varsayilan) koyar
        // Default degerler sayilar icin sifirdir.
        // Dil bilgisindeki nokta(.) ne ise java daki noktali virgul(;) ayni seydir. ve statementin bittigini gosterir
        // java da esittir demek "==". Yani Matematik te "=", java da "=="

        /*
            Java da temelde iki tip data vardir.
            1)primitive data type:
            char, boolean, byte, short , int, long, float, double
            2)non-primitive data type:
             String
         */
        //Ornek 1 : Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        // String'lere verilen degerler daima cift tirnak icinde olmalidir


        String studentName = "Ali Can" ;


        // String bir variable olusturup ona herhangi bir atama yapmazsak java o variable a Default deger olarak olarak "null" koyar.
        // null demek 0 demek degil, cunku 0 da coding te bir degerdir
        // null demek ici bos obje demektir.
        // yani icinde variable veya method bulunmayan default obje demektir
        // []==> bos kume= null {0} ==> 1 elemani var

        //char data type:
        // Tek karakterler icin kullanilir. Ornegin ==> A, x, ?, 5
        //Ornek 2 : char data type inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        // Not: Char data type inda degerler tek tirnak (') icine konulmalidir


        char isminIlkHarfi = 'A' ;

        //boolean data type:
        // boolean'lar sadece iki farkli deger alabilir; true (dogru) yada false (yanlis)
        // Ornek 3: boolean data type'inda emeklimisin icin bir variable olusturun ve false degerini atayin

        boolean emeklimisin = false ;

        //byte data type:
        // tam sayilar icindir hafizada 1 byte yer kaplar
        // byte: -128 den +127 ye kadar tamsayi degerleri icin kullanilir
        // Ornek 4 : Byte data type inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz


        byte ogrenciYasi = 20 ;


        //short data tpye:
        //tam sayilar icindir hafizada 2 byte yer kaplar.
        //short : -32768 ile 32767 arasindaki tam sayilar icin kullanilir
        // Ornek 5 : Site nufusu icin bir variable olusturun

        short siteNufusu = 3500 ;

        // int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 6: Ulke nufusu icin bir variable olusturun ve deger atamasi yapin

        int ulkeNufusu = 80000000 ;

        // long data type:
        // Tam sayilar icindir hafizada 8 byte yer kaplar.
        //Ornek 7: insan vucundaki hucre sayisi icin deger atamasi yapiniz
        //Not: Bir deger long ise sonuna "L"(Tercih edilir) veya kucuk "l" konulur
        //Eger longa atadiginiz deger int`lerin araliginda ise sonuna 'l' koymamiza gerek yok.
        // long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder

        long insanHucresi = 10000000000L ;

        // float data type:
        // float data tipi Virgullu sayilar(ondalikli sayilar ==> Decimal Numbers) icin kullanilabilir
        //Not: java ondalikli sayilari yani "Decimal Numbers" i otomatik olarak "double" kabul eder
        //eger float data type `i olmasinda israr ederseniz sonuna "F" veya "f" koymalisiniz
        // float hafizada 4 byte yer kaplar
        // Ornegin fiyatlandirmalar icin tercih edebilir (12.99)
        // Ornek 8: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz

        float gomlekFiyati = 12.99F ;
        float ayakkabiFiyati = 15.99F ;

        System.out.println("Toplam ucret : " + (gomlekFiyati + ayakkabiFiyati ));

        //System.out.println(); yazdirmanin kisayolu sout yaz enter a bas
        //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar
        //System.out.print(); ekrana yazdirir ve pointer i ayni satirda tutar

        //double data type:
        // double data tipi virgullu sayilar (ondalikli sayilar ==>Decimal numbers) icin kullanilabilir
        //double memoryde float'dan daha fazla yer kaplar, virgulden sonraki rakam daha fazla alir
        // Ornek 9: Hucre agirligi ve amipin agirligi icin iki tane variable olusturunuz agirliklarinin farkini console a yazdiriniz

        double hucreAgirligi = 0.000000000112 ;
        double amipAgirligi = 0.0000000000082 ;

        System.out.println("Agirlik Farki : " + (hucreAgirligi - amipAgirligi ));
















    }

}









