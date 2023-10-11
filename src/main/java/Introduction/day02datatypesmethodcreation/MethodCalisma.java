package Introduction.day02datatypesmethodcreation;

import java.util.Scanner;

public class MethodCalisma {
    public static void main(String[] args) {

//2 sayiyi carpip sonra baska 2 sayiyla toplayin

        int ikiCarpmaikiToplamaSonucu = ikiCarpmaikiToplama(5, 9,4,3);
        System.out.println("Sonuc = " + ikiCarpmaikiToplamaSonucu);


        yazdirma("Omer ALi ");

        //Kullanicidan isim alip ekrana yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk isminizi yaziniz");
        String ilkIsim = input.next();
        System.out.println("Lutfen ikinci isminizi yaziniz");
        String ikinciIsim = input.next();
        System.out.println("Lutfen soyisminizi yaziniz");
        String soyIsim = input.next();
        System.out.println("Isim Soyisim = " + (ilkIsim +" " + " " + ikinciIsim + " " + soyIsim ));








    }


   public static int ikiCarpmaikiToplama (int a, int b, int c, int d){

    return a*b+c+d;


    }



// isim Soy isim yazdirma

    private static void  yazdirma (String str){

        System.out.println(str);
    }















}
