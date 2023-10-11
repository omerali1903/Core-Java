package JavaAdvancedPractice.LambdaRecap;


import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        ciftPozitifElYazdir(sayi);

        System.out.println();

        ciftVePozitifMetRef(sayi);

        System.out.println();

        elemanlarinKareleriniYazdir(sayi);

        System.out.println();

        elemanlariTekrarsizKareleriniYazdir(sayi);

        System.out.println();

        elemanlariBuyuktenKucugeSiralayipYazdir(sayi);

        System.out.println();

        pozitifElemanlarinKupleriniBirlerBasamagiBesOlaniYazdir(sayi);

        System.out.println();

        elemanlarinToplaminiBul(sayi);

        System.out.println();
        toplaminiLEileBulveYazdir(sayi);
        System.out.println();

        System.out.println(ciftElKareKucBuySirListReturn(sayi));




    }


    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftPozitifElYazdir(List<Integer> sayi) {
        sayi.stream().
                filter(Utils::ciftVePozitifSayiAl).
                forEach(t -> System.out.print(t + " "));
    }


    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifMetRef(List<Integer> sayi) {

        sayi.stream().
                filter(Utils::ciftVePozitifSayiAl).
                forEach(Utils::yazdir);
    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void elemanlarinKareleriniYazdir(List<Integer> sayi) {
        sayi.stream().
                map(Utils::kareAl).
                forEach(Utils::yazdir);
    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void elemanlariTekrarsizKareleriniYazdir(List<Integer> sayi) {
        sayi.stream().
                distinct().
                map(Utils::kareAl).
                forEach(Utils::yazdir);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın

    public static void elemanlariBuyuktenKucugeSiralayipYazdir(List<Integer> sayi) {
        sayi.stream().
                sorted(Comparator.reverseOrder())
                .forEach(Utils::yazdir);
    }


    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız

    public static void pozitifElemanlarinKupleriniBirlerBasamagiBesOlaniYazdir(List<Integer> sayi) {
        sayi.stream().
                filter(Utils::pozitif).
                map(Utils::kupleriAl).
                filter(t -> t % 10 == 5).
                forEach(Utils::yazdir);
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın

    public static void elemanlarinToplaminiBul(List<Integer>sayi){
      Optional<Integer> sonuc =   sayi.stream().reduce(Math::addExact);
        System.out.print(sonuc);
    }


    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

    public static void toplaminiLEileBulveYazdir(List<Integer>sayi){
       int sonuc= sayi.stream().reduce(0,(a,b)->a+b);
        System.out.print(sonuc);
    }

    //SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız

    public static List<Integer> ciftElKareKucBuySirListReturn(List<Integer>sayi){
        List<Integer> sonuc =sayi.stream().
                filter(Utils::ciftMi).
                map(Utils::kareAl).
                sorted().
                collect(Collectors.toList());
        return sonuc;
    }


}
