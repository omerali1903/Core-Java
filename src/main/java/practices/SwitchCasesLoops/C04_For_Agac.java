package practices.SwitchCasesLoops;

import java.util.Scanner;

public class C04_For_Agac {

    public static void main(String[] args) {


/*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */


        Scanner input = new Scanner(System.in);

        System.out.println("Yaprak Satir Sayisini giriniz");
        int yaprakSatirSayisi = input.nextInt();

        System.out.println("Govde Satir Sayisini Giriniz");
        int govdeSatirSayisi = input.nextInt();


        String yaprak ="";

        for (int i = 0;i<yaprakSatirSayisi;i++){

            yaprak=yaprak+"^";

            System.out.println(yaprak);
        }

        String govde = "";

        for (int i =0;i<govdeSatirSayisi;i++){

            System.out.println("|||");
        }








    }
}
