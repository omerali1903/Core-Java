package practices.SwitchCasesLoops;

import java.util.Scanner;

public class C02_Switch {


    public static void main(String[] args) {


   /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz...");
        System.out.println("Lutfen 1-4 Arasi Islem Numaranizi Giriniz \n"+
                "Işlem 1: Bakiye Sorgulama \n"+
                "Işlem 2: Para Cekme \n"+
                "Işlem 3: Para Yatırma \n"+
                "Işlem 4: İşlemi Sonlandır");
        int islemNo = input.nextInt();

        int bakiye = 1000;

        switch (islemNo){


            case 1://Bakiye Sorgulama
                System.out.println("Bakiyeniz : " + bakiye + " TL" );
                break;
            case 2://Para Cekme
                System.out.println("Lutfen cekmek istediginiz parayi yaziniz");
                int paraCekme = input.nextInt();

                if (paraCekme>bakiye){
                    System.out.println("Yeterli bakiyeniz yok...");
                }else {
                    System.out.println("Cekilen Para : " + paraCekme + " TL");
                    bakiye = bakiye-paraCekme;
                    System.out.println("Kalan Para : " +bakiye+ " TL");

                }
                break;

            case 3://Para Yatirma
                System.out.println("Lutfen Yatirmak istediginiz parayi giriniz ( Limit 2000 TL)");
                int yatiralacakPara = input.nextInt();

                if (yatiralacakPara<=2000){
                    bakiye=bakiye+yatiralacakPara;
                    System.out.println("Para Yatirma isleminden sonraki mevcut Bakiyeniz : "+bakiye+" TL");
                }else {
                    System.out.println("Para Limiti 2000 TL");
                }

                break;

            case 4:// Islemi Sonlandirma
                System.out.println("Bankamizi kullandiginiz icin tesekkur ederiz");
                break;

            default:
                System.out.println("Gecersiz islem numarasi");


        }








    }



}
