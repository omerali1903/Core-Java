package Introduction.day09stringmanipulationsifstatement;

public class C01_StringManipulations {

    public static void main(String[] args) {

   // ****************isEmpty()********************\\

        /*
        isEmpty() bos mu dolumu diye bakar.Bize boolean bir deger dondurur
                  sadece hiclikte true dondurur

         */
        String str = "";
        //1.yol
        boolean result1 =str.length()==0;
        System.out.println(result1);

        //2.yol

       boolean result2 = str.isEmpty();//makbul olan budur
        System.out.println(result2);

        //Ex: Bir String'in bosluk haric hicbir karakter icermedigini kontrol eden kodu yaziniz
        //1.yol
        String str2 = "  ";
        boolean result = str2.replace(" ","").length()==0;
        System.out.println("result = " + result);
        
        //2.yol
        
        boolean result22 = str2.replace(" ","").isEmpty();
        System.out.println("result22 = " + result22);

        //Ex: Bir String'in "*" haric bir karakter icermedigini kontrol eden kodu yaziniz
        String str3= "*";
        boolean rslt = str3.replace("*","").length()==0;
        boolean rslt2 = str3.replace("*","").isEmpty();
        System.out.println("rslt = " + rslt);//true
        System.out.println("rslt2 = " + rslt2);//true


        //*****************isBlank*******************\\

        /*
        isBlank methodu String bir datada space + hiclik icin true dondurur
        Bosmu dolumu oldugunu kontrol eder. Boolean bir deger dondurur
        isEmpty den farki variable'da sadece space varsa bosmu dolumu diye soruldugunda isBlank == Bos der
                                                                                        isEmpty == Bos degil der
         */

      boolean rslt3= str2.isBlank();
        System.out.println("rslt3 = " + rslt3);//true

        boolean rslt4= str2.isEmpty();
        System.out.println("rslt4 = " + rslt4);//false

        /*

        indexOf() verilen karakter veya karakterlerin ilk gorunumun indexini verir
        tekli karakter icinde , coklu karakter icinde kullanilabilir
        Coklu datalarda String ifadenin ilk gorunumunun ilk karakterinin indexini dondurur
        olmayan dataya -1 dondurur


         */

        //EX: Bir String de a,i,e karakterlerinin ilk gorunumlerinin indexini toplamini ekrana yazdiriniz

        String r = "Java is easy to learn";
        int a =r.indexOf('a');
        System.out.println("a = " + a);
        int i = r.indexOf('i');
        System.out.println("i = " + i);
        int e = r.indexOf('e');
        System.out.println("e = " + e);
        System.out.println("Sonuc : " + (a+i+e));

        //EX: Bir String de "Java" kelimesinin ilk olarak kacinci index'de
        // kullanildigini gosteren kodu yaziniz

        String u = "Ah Java vah Java sen ne guzel seysin Java";
        int idxJava =u.indexOf("Java");
        System.out.println("idxJava = " + idxJava);

        String ú = "Python";
        int isadasd = ú.indexOf("Java");
        System.out.println("isadasd = " + isadasd);//-1 verir

        //*************************lastIndexOf()*******************************
        /*

        lastindexOf() Verilen bir datada karakter ya da karakterlerin  son gorunumun indexlerini verir
        Olmayan bir datanin kacinci indexte


         */
        //Ex: Bir String de a, i , e nin son bulundugu indexlerin toplamini yaziniz
        String r2 = "Java is easy to Learn";

        int index5 = r2.lastIndexOf("a");

        System.out.println("index5 = " + index5);

        int index6 = r2.lastIndexOf("i");

        System.out.println("index6 = " + index6);

        int index7 = r2.lastIndexOf("e");

        System.out.println("index7 = " + index7);

        System.out.println("result="+ (index5+index6+index7));










    }

}
