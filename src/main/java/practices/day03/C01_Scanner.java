package practices.day03;

import java.util.Scanner;

public class C01_Scanner {


    public static void main(String[] args) {

        //INTERWIEW QUESTIONS


    //Example 1 : Kullanicidan aldiginiz bir sekil ile asagidaki sekli olusturan kodu yaziniz
        /*

             A
            A A
           A A A



         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz...");

        char ch = input.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);


        //Ex : Kullanicidan 2 sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        System.out.println("Lutfen ilk sayiyi giriniz");
        int a= input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int b= input.nextInt();

        System.out.println("Lutfen istediginiz islemin numarasini  giriniz\n"+"Toplama icin 1 , Cikartma icin 2 , Carpma icin 3 , Bolme icin 4" );
        int n = input.nextInt();

        switch (n){

            case 1:
                System.out.println("Toplama sonucu = "+(a+b));
                break;

            case 2:
                System.out.println("Cikartma sonucu = "+(a-b));
                break;

            case 3 :
                System.out.println("Carpma sonucu = "+(a*b));
                break;
            case 4:
                System.out.println("Bolme sonucu = "+(a/b));
                break;
            default:
                System.out.println("Gecerli islem girmediniz");
        }





        //Ex  kullanicidan alacaginiz 5 basamakli bir sayinin ilk 2 ve son 2  rakamlari toplamini
       //bulan kodu yaziniz

        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int besBasamak = input.nextInt();



        int lastDigit = besBasamak%10;
        besBasamak = besBasamak/10;

        int lastSecondDigit=besBasamak%10;
        besBasamak = besBasamak/10;


        int lastThirdDigit = besBasamak%10;
        besBasamak = besBasamak/10;

        int lastFourthDigit=besBasamak%10;
        besBasamak = besBasamak/10;

        int lastFifthDigit = besBasamak%10;
        besBasamak = besBasamak/10;

        int sonuc = lastFifthDigit+lastFourthDigit+lastDigit+lastSecondDigit;

        System.out.println(sonuc);

























    }







}
