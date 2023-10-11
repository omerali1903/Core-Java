package practices.SwitchCasesLoops;

import java.util.Scanner;

public class C05_For {
    public static void main(String[] args) {
/*
        Kullanicidan sisteme 5 adet sayi girmesini isteyin
        Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

      */

        Scanner input = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0 ; i<5 ;i++){

            System.out.println("Bir Sayi giriniz");
            int sayi = input.nextInt();

            if (sayi>=5 && sayi<=10){
                System.out.println("Girdiginiz Sayi 5 ile 10 Arasinda Oldugundan Isleme Alinmayacaktir");
            }else {
               toplam = toplam + sayi;
            }
        }
        System.out.println(toplam);

    }



}
