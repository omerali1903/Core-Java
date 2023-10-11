package Introduction.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

    //Kullanicidan alacaginiz 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiriniz
        //%==>Modulus operatoru sayinin bolumunden kalan sayiyi verir
      Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli sayi veriniz");
        int sayi = input.nextInt();
        int sonRakam = sayi%10;
        int ilkRakam = sayi/1000;
        System.out.println("Ilk rakam + Son rakam =  " + (ilkRakam + sonRakam));








    }









}
