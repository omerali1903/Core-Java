package Introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
// !!Odev!!
    public static void main(String[] args) {
     // Kullanicidan bir diktortgenin iki kenar uzunlugunu aliniz
     // 1) Alanini hesaplayiniz
     // 2) Cevresini hesaplayiniz

        Scanner input = new Scanner (System.in);
        System.out.println("once uzun sonra kisa kenar uzunlugu giriniz...");

        double uzunKenar = input.nextDouble();
        double kisaKenar =input.nextDouble();

        System.out.println("Diktortgenin alani = " + (uzunKenar * kisaKenar));
        System.out.println("Dikdortgenin cevresi = " + (uzunKenar *2 + kisaKenar*2));








    }



}
