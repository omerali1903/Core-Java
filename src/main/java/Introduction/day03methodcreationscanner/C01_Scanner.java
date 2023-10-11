package Introduction.day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        /*

        Kullanicidan data almak icin Scanner Classi kullanilir.Ve bir input/ scan/ scanner Objesi olusturulur
        .Bu objeyi new objeyi new key worduyle olustururuz

     */
        // 1 )Adim Object Olusturma
        Scanner input = new Scanner(System.in);

        //2 ) Kullaniciya ne yapacagini soyluyoruz
        System.out.println("Lutfen maasinizi giriniz");

        // 3 ) Adim kullanicidan alinan datalar yapisina ve
        // buyuklugune gore bir Variable'a yerlestirilir
        long maas = input.nextLong();
        // 4) Kullanicini verdigi bilgileri teyit edebilmesi vs. icin yazdiriyoruz


        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , soran bir program yaziniz

        System.out.println("Lutfen cinsiyetiniz Kadin ise K erkek ise E olarak giriniz");

        char cinsiyet = input.next().charAt(0);

        System.out.println("Lutfen adinizi giriniz");
        input.nextLine();
        String isim = input.nextLine();

        System.out.println("Lutfen memleketinizi giriniz");
        String memleket = input.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi true yada false seklinde giriniz");
        boolean seviyorMu = input.nextBoolean();

        System.out.println("Maas :"+maas+"\nCinsiyet:"+ cinsiyet+"\nisim:"+isim+"\nMemleket:"+memleket+"\nYas:"+yas+"\nBoy:"+boy+"\nSeviyor musunuz?:"+seviyorMu);




    }
}