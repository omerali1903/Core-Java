package Introduction.day20arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class DateTime01 {

    public static void main(String[] args) {


        //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-03-15

        //Tarih'ten istedigimiz bileseni nasil aliriz?
        int monthValue =myCurrentDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue =myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue = myCurrentDate.getDayOfMonth();

        System.out.println(dayValue);//15

        //Asagidaki "Month" bir Enum'dir.
        //Enum, Java'da sabit degerleri (Ay isimleri,Gun isimleri,Ulkedeki sehir isimleri,Samanyolu Galaksisindeki gezegen isimleri)
        //depolamak icin kullanilir
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);//MARCH

        //Asagidaki "DayOfWeek" bir Enum'dir
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//WEDNESDAY

        //Asagidaki kod ile gelecege gidebiliriz ve bu sayede gelecege donuk bir kod yazabiliriz
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));//2027-05-20

        //Gecmis tarihede bu sekilde gidilir
        System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18));//1992-12-18



    }



}
