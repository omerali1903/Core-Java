package practices.day08;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C02_LocalDate {

    public static void main(String[] args) {
         /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */




                // Ali'nin doğum tarihi
                LocalDate aliDogumTarihi = LocalDate.parse("29.10.1923", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                Period aliPeriyot = Period.ofYears(45).plusMonths(8).plusDays(5);
                LocalDate aliYeniTarih = aliDogumTarihi.plus(aliPeriyot);
                System.out.println("Ali'nin doğum tarihi: " + aliYeniTarih.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

                // Veli'nin doğum tarihi
                LocalDate veliDogumTarihi = LocalDate.parse("15.09.1993", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                Period veliPeriyot = Period.ofYears(24).plusMonths(2).plusDays(11);
                LocalDate veliYeniTarih = veliDogumTarihi.minus(veliPeriyot);
                System.out.println("Veli'nin doğum tarihi: " + veliYeniTarih.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

                // Ali ve Veli'nin doğum tarihinin aynı olup olmadığı kontrol edilir
                if (aliYeniTarih.equals(veliYeniTarih)) {
                    System.out.println("Ali ve Veli aynı tarihte doğmuşlar.");
                } else {
                    System.out.println("Ali ve Veli aynı tarihte doğmamışlar.");
                }
            }
        }








