package practices.day02;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Adinizi giriniz");
         String ad =input.nextLine();
        System.out.println("Lutfen Soyadinizi giriniz");
        String soyad =input.next();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = input.nextInt();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = input.nextDouble();

        System.out.println("Adi: "+ad+ "\n"+"Soyadi: "+soyad+"\n"+"Yas : "+yas+"\n"+"Boy: "+boy+"\n"+"Kilo: "+kilo);

    }


}
