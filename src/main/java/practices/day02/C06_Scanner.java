package practices.day02;

import java.util.Scanner;

public class C06_Scanner {
// Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
    // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Lutfen isminizi ve soyisminizi giriniz");
    String adSoyad = input.nextLine().toUpperCase();

    char isminIlkKarakteri = adSoyad.charAt(0);
    char soyisimIlkKarakteri = adSoyad.charAt(adSoyad.indexOf(" ")+1);

    System.out.println("Isim Soyisim ilk harfi : " + isminIlkKarakteri+soyisimIlkKarakteri);







}





}
