package Introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {
    // Kullanicinin adresini aliniz ve ekrana yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adresinizi giriniz...");
        //next() methodu kullanicidan tek kelimeli String'i almak icin kullanilir
        //nextLine () method'u kullanicidan cok kelimeli Stringi almak icin kullanilir.

        String address = input.nextLine();

        System.out.println(address);






    }




}