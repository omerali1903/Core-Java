package practices.day01;

public class Q01_Variables {

    public static void main(String[] args) {

        // Bir variable baslat
        byte age = 15;
        byte number = 43;
        String isim = "Ali";
        System.out.println("isim = " + isim);

        System.out.println(age);

        System.out.println("number = " + number);
        //degerimiz + .soutv yazarsak otomatikmen yazisiyla beraber yazar
        // Ornek number.soutv
        // Variable degerini kopyala
        int myage = age;

        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //Ayni satirda coklu variable deklere et

        int year = 2023, month = 2, day = 2;

        System.out.println("year = " + year);

        // Bir variable degerini guncelle

        year = 2024;
        System.out.println("year = " + year);

        isim = "Veli";
        System.out.println("isim = " + isim);

        //Bir variable deklere et : x
        //Bir variable baslat : y
        // Baska bir variable baslat: z
        //x degiskenini y degiskeni ile baslat
        //Variable guncelle
        // Degiskenleri yazdir

        byte x = 32;

        int y = 68;
        System.out.println("y = " + y);

        String z = "Mehmet";
        System.out.println("z = " + z);


        y = x;
        System.out.println("y = " + y);

       z = "Adam";
        System.out.println("z = " + z);


    }


}
