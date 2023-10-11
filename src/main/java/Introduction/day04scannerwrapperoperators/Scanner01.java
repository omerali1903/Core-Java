package Introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
    //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamaagindaki rakamlarin toplamini yazdiran kodu yaziniz
    // Bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani aliriz
    // Bir tam sayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tamsayi yapar. java sonucu nasil tam sayi yapar?
    // Ondalikli kismi iptal eder.Java yuvarlama yapmaz
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int number = input.nextInt();
        //%==> modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir
        //Son rakami al
        //dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir.
        int lastDigit = number%10;
        //sayi kucult
        number = number/10;
        // sondan ikinci rakami al
        int lastSecondDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan ucuncu rakami al
        int lastThirdDigit =number%10;
        //sayi kucult
        number =number/10;
        //sondan dorduncu rakami al
        int lastFourthDigit =number%10;
        number = number/10;

        //sondan besinci rakami al
        int lastFifthDigit =number%10;
        //sayiyi kucult
        number = number/10;

        System.out.println("Sonuc = "+(lastDigit + lastSecondDigit + lastFourthDigit + lastFifthDigit) );

















    }




}
