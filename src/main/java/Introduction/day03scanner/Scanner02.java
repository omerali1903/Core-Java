package Introduction.day03scanner;


import java.util.Scanner;

public class Scanner02 {
  //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz
  public static void main(String[] args) {
  // 1. adim : Scanner Class'tan object olustur.
      Scanner input = new Scanner(System.in);
  //2. adim : Kullaniciya ne istedigimize dair mesaj veriniz.
      System.out.println("Isminizi giriniz...");
      String firstName = input.next();

      System.out.println("Soy isiminizi giriniz...");

      String lastName = input.next();

      System.out.println(firstName + " " + lastName);


  }


}
