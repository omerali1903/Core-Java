package Introduction.day03scanner;

import java.util.Scanner;

public class Scanner05_2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz");
        double shortSide = input.nextDouble();

        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz");
        double longSide = input.nextDouble();

        System.out.println("Dikdortgenin alani = " +shortSide * longSide);
        System.out.println("Dikdortgenin cevresi = " + 2*shortSide + 2*longSide);









    }





}
