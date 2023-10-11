package Introduction.day07stringmanipulations;

public class C02_StringManipulations {

    public static void main(String[] args) {

        //ReplaceAll()

        /*
        ReplaceAll() Bir grup datayi degistirmek icin kullanilir
                     Bir grup data = Regular Expression (Regex) kullanilir



            En Cok Kullanilan Regexler:
            1)Tum Rakamlar ==> [0-9]
            2)Tum Kucuk Harfler ==> [a-z]
            3)Tum Buyuk Harfler ==> [A-Z]
            4)Tum Harfler [a-zA-Z]
            5)Tum Harfler ve Rakamlar ==> [a-zA-Z0-9]
            6)Tum Sesli Harfler ==> [aeiouAEIOU]
            7)Tum noktalama Isaretleri ==> \\p{Punct}

            ^==> den farkli,haricinde basina sapka koyun "^"

            1)Tum Rakamlar ==> [^0-9]
            2)Tum Kucuk Harfler ==> [^a-z]
            3)Tum Buyuk Harfler ==> [^A-Z]
            4)Tum Harfler [^a-zA-Z]
            5)Tum Harfler ve Rakamlar ==> [^a-zA-Z0-9]
            6)Tum Sesli Harfler ==> [^aeiouAEIOU]
            7)Tum noktalama Isaretleri ==> \\p{Punct}


         */
        String s = "Mehmet Fatih bey 20 yasinda QA_Developer kursunda $ dolarla maas kazanmistir...";


        //Ex s String'indeki tum rakamlari "*" ceviriniz
        String s1 = s.replaceAll("[0-9]", "*");
        System.out.println(s1);

        //EX: s Stringindeki tum harfleri ve tum rakamlari "@" ceviriniz
        String s2 = s.replaceAll("[a-zA-Z0-9]", "@");
        System.out.println(s2);

        // Ex : s String'indeki tum spaceler disindaki karakterleri "+" ceviriniz

        String s3 = s.replaceAll("[^ ]", "+");
        System.out.println("s3 = " + s3);

        //EX: s String'indeki tum kucuk harfler disindaki karakterleri "*" ceviriniz
        String s4 = s.replaceAll("[^a-z]", "*");
        System.out.println(s4);

        //Ex: s String indeki tum sesli harfler disindaki karakterleri "&" ceviriniz
        String s5 = s.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(s5);


    }


}
