package Introduction.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

    //Anlik zamani nasil aliriz
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);

    // Anlik zamanda bilesenler nasil alinir?
      int hour =  myCurrentTime.getHour();
        System.out.println(hour);

        int minute =myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        int nano = myCurrentTime.getNano();
        System.out.println(nano);

        //Gelecek ve gecmis zamana nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss a");

        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date formati nasil degistirilir?

        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formattedMyCurrentDate1 = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate1);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);

        //Tarihi Gun/Ay ismi /yil sekline ceviriniz . 25/August/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);

        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //Tokyo'da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Tashkent'te ayin kaci?
        LocalDate dateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);

        //Tokyo'da saat kac?
        LocalTime timeinTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeinTokyo);

        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);//19:52:19.433288




    }



}
