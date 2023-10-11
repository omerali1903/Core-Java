package Introduction.day06typecastingstringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {

        String a = "Tek Rakibim Dunku Ben.";


        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);

        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);

        a.charAt(0);
        System.out.println("ilk karakter = " + a.charAt(0));

        System.out.println("10.index = " + a.charAt(10));

        char lastSecondChar = a.charAt(19);
        char firstSecondChar = a.charAt(1);


        System.out.println("FirstChar+LastsecondChar = " + lastSecondChar + firstSecondChar);
        //Ascii tablo degerini almamasi icin yazdirirken basa String le yazi yazdirmamiz gerek

        System.out.println("a.length() = " + a.length());

        System.out.println(a.substring(0, 4));

        //a String indeki 4.index dahil 7.index haric yazdiriniz
        System.out.println(a.substring(4, 7));

        //a String'indeki "Rakib" kelimesini aliniz
        System.out.println(a.substring(4, 9));

        System.out.println(a.substring(6));
        //eger beginIndex secersek mesela 6 diyelim 6.indexten itibaren kalan herseyi alir

        //a String'inde "bim" kelimesinin olup olmadigini kontrol ediniz
        System.out.println(a.contains("bim"));//true

        String b = "omeralikaya4@gmail.com";
        System.out.println(b.contains("@"));//true

        System.out.println(a.startsWith("T"));//true

        System.out.println(a.startsWith("Tek", 3));//false
        //toffset kismina 3 ekledigim icin 3.indexten itibaren bakiyor ve bu yuzden false verdi
        //eger 0 yazsaydim true dondurecekti

        //Universite numaralari yil + BolumKodu + O bolume giris sirasi olarak duzenlenen bir okulda
        //Ogrenci Umran'in Hukuk Fakultesinde okuyup okumadigini gosteren kodu yaziniz

        /*
        Sinif ogretmenligi 22 Hukuk 33 bilgisayar 44 Eczacilik 55 Maliye 66

        */
        String str = "20105501";
        System.out.println(str.startsWith("33", 4));


    }

}
