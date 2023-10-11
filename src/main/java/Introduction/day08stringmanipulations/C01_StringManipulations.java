package Introduction.day08stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        //************** replaceFirst () ***************\\
/*
replaceFirst () : replace ile aynı işi yapmakla birlikte
ilk gördüğü datayı değiştirir.
 */
        String str = " Bizimle Java Ogrenmek Cok Kolay";
// Ex : str String'indeki "a" harflerinin yerine "e" harfi yerlestiriniz
        String str1 = str.replaceFirst("i", "e");
        System.out.println("str1 = " + str1);

        String str2 = str.replace("i", "e");
        System.out.println("str2 = " + str2);

        //******************** trim() ***************************
        /*
          trim() Bir String'de bastaki ve sondaki space karakterlerini siler . Ortadaki space karakterlerine dokunmaz

         */

        String isim = "   Mehmet Fatih Yildirim  ";

        String isim1 = isim.trim();
        System.out.println("isim = " + isim);

        //EX: Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //String tv ="599.99$"  String laptop = "299.99$"
        String tv = "599.99$";
        String laptop = "299.99$";
        //Dolarlardan kurtulalim
        String tv2 = tv.replace("$", "");//Dolar gordugun heryere hicbirsey yazma methodu

        System.out.println("tv2 = " + tv2);

        String laptop2 = laptop.replace("$", "");

        System.out.println("laptop2 = " + laptop2);

        Double totalPrice = Double.valueOf(laptop2) + Double.valueOf(tv2);

        System.out.println("totalPrice = " + totalPrice);

        String tamIsim = "mehmet fatih";
        // Verilen tamIsim String'inin icindeki ilk ismin ilk harfiyle son ismin ilk harfini buyuk harf olarak yan yana yazdiriniz

        char first =tamIsim.trim().toUpperCase().charAt(0);
        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println("first + second : "+first+second);







    }


}
