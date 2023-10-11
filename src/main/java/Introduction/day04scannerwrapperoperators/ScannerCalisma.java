package Introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class ScannerCalisma {
//Kullanicidan alinan 3 sayiyi carpmaya yariyan program
public static void main(String[] args) {

    Scanner input = new Scanner (System.in);

    System.out.println("Lutfen 3 sayi giriniz");
    double number = input.nextDouble();
    double secondNumber = input.nextDouble();
    double thirdNumber = input.nextDouble();

    System.out.println("Carpma Sonucu = " + (number*secondNumber*thirdNumber));







}






}
