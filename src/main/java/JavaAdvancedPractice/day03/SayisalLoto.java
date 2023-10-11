package JavaAdvancedPractice.day03;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;
public class SayisalLoto {
   /* Proje: Sayısal Loto Uygulaması

       1) Kullanici Bileti icin sistem tarafindan rastgele n tane sayı üretilsin.
            2) Loto sonucu icin de rastgele n tane sayı ile üretilsin.
            3) Sayısal lotoda tekrarlı sayılar olmasin.
       4) n(hane sayısı), sayılar için kullanicidan min ve max degerler alınsın.
            5) loto sonucu ile bilet ile karsılastırılsın,
       6) kac eslesme oldugu kullanıcıya bildirilsin.
       7)  Eger eslesme varsa;
    Max deger>50 ise ==>buyuk ikramiye
    Max deger>100 ise ==>super ikramiye
    Max deger>0 ise ==>amorti kazandiniz yazdirsin

*/






        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Kullanıcı biletinde kaç sayı olacağını belirleyin
            System.out.println("Kaç sayı olsun? ");
            int n = scanner.nextInt();

            // Kullanıcı sayıları için minimum ve maksimum değerleri alın
            System.out.println("Minimum değer: ");
            int min = scanner.nextInt();
            System.out.println("Maksimum değer: ");
            int max = scanner.nextInt();

            if (min==max){
                System.out.println("Minimumla Maximum ayni olamaz");
                System.out.println("Lutfen programi yeniden baslatin");

            }

            // Kullanıcı biletini oluşturun
            ArrayList<Integer> kullaniciBileti = rastgeleSayilar(n, min, max);
            System.out.println("Kullanıcı bileti: " + kullaniciBileti);

            // Loto sonucunu oluşturun
            ArrayList<Integer> lotoSonucu = rastgeleSayilar(n, min, max);
            System.out.println("Loto sonucu: " + lotoSonucu);

            // Kullanıcı biletiyle loto sonucunu karşılaştırın
            int eslesmeSayisi = karsilastir(kullaniciBileti, lotoSonucu);
            System.out.println("Eşleşme sayısı: " + eslesmeSayisi);

            // İkramiye kazanıp kazanmadığınızı kontrol edin ve mesaj yazdırın
            if (max > 50 && eslesmeSayisi == n) {
                System.out.println("Tebrikler, büyük ikramiye kazandınız!");
            } else if (max > 100 && eslesmeSayisi == n) {
                System.out.println("Tebrikler, süper ikramiye kazandınız!");
            } else if (eslesmeSayisi > 0) {
                System.out.println("Amorti kazandınız!");
            } else {
                System.out.println("Maalesef kazanamadınız.");
            }

            scanner.close();



        }

        // Belirtilen sayıda rastgele sayılar oluşturun ve geri döndürün
        public static ArrayList<Integer> rastgeleSayilar(int n, int min, int max) {
            ArrayList<Integer> sayilar = new ArrayList<>();
            Random random = new Random();
            while (sayilar.size() < n) {
                int sayi = random.nextInt(max - min + 1) + min;
                if (!sayilar.contains(sayi)) {
                    sayilar.add(sayi);
                }
            }
            Collections.sort(sayilar);
            return sayilar;
        }

        // İki sayı listesinde kaç adet eşleşen sayı olduğunu hesaplayın ve geri döndürün
        public static int karsilastir(ArrayList<Integer> liste1, ArrayList<Integer> liste2) {
            int eslesmeSayisi = 0;
            for (int sayi : liste1) {
                if (liste2.contains(sayi)) {
                    eslesmeSayisi++;
                }
            }
            return eslesmeSayisi;
        }




    }



