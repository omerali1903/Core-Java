package practices.day03;

import java.util.Scanner;

public class C02_IfElse {

    public static void main(String[] args) {

    /*
Kullanicidan bir gun alin
Eger gun cuma ise "Muslumanlar Icin Kutsal Gun" ;
Eger gun cumartesi ise "Yahudiler icin Kutsal Gun"
Eger gun pazar ise "Hristyanlar icin Kutsal Gun"
 yazdiran kodu olusturunuz
 */

        //1.Way

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gun =input.next().toLowerCase();

        if (gun.equals("cuma")){

            System.out.println("Muslumanlar icin kutsal bir Gun");
        } else if (gun.equals("cumartesi")) {

            System.out.println("Yahudiler icin Kutsal Gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin Kutsal Gun");

        }else{
            System.out.println("Siradan bir gun");
        }

        //2.Way

        System.out.println("Lutfen gun ismi giriniz");
        String gun2 = input.next().toLowerCase();

        switch (gun2){

            case "cuma":
                System.out.println("Muslumanlar icin kutsal bir gun");
                break;
            case "cumartesi":
                System.out.println("Yahudiler icin kutsal bir gun");
                break;
            case "pazar":
                System.out.println("Hristiyanlar icin kutsal bir gun");
                break;
            default:
                System.out.println("Siradan bir gun");
        }


             /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
        3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */


        System.out.println("Lutfen 3 karakterden daha uzun bir kelime giriniz");
        String ucKelime = input.next().toLowerCase();

        if (ucKelime.length()<=3){

            System.out.println("3 Karakterden Daha Uzun Bir Kelime Girmelisiniz");

        }else {

            String sonUcHarf = ucKelime.substring(ucKelime.length()-3,ucKelime.length());

            String str = sonUcHarf+ucKelime+sonUcHarf;

            System.out.println(str);


        }



    }
}
