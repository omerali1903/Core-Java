package Introduction.day03scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {
    //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonucunu ekrana yazdiran kodu yaziniz
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz...");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Toplama islemi sonucu = " + firstNumber + secondNumber);
        System.out.println("Cikartma islemi sonucu = " + (firstNumber - secondNumber));
        System.out.println("Carpma islemi sonucu = " + firstNumber * secondNumber);
        System.out.println("Bolme islemi sonucu = " + firstNumber / secondNumber);











    }
}
