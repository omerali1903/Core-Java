package Introduction.day18constructorsstatickeyword;

public class MethodOverloading {



    /*
    1) bir method ayni isim ve farkli parametrelerle olusturulursa buna "Method Overloading" denir.
    2) "Method Overloading" javada "iyi organizasyon" icin onemlidir.
    3) Method Overloading yapilirken parametre 3 sekilde degistirilebilir.
       i.   parametrelerin sayilari degistirilebilir.
       ii.  parametrelerin data type'larini degistirebilirsiniz
       iii. parametrelerin data type'lari farkli ise yerleri degistirilebilir.

    4) "Method Overloading" bir class'in icinde olusur bu yuzden "private" method'lar da overload edilebilir.
         "Method Overloading" butun access modifier'larda kullanilabilir.
    5)"static" methodlar overload edilebilir
     */

    public static void main(String[] args) {

        add(3,5);

    }


    public static int add(int a, int b) {

        return a + b;
    }


    public static int add(int a, int b, int c) {

        return a + b + c;
    }

    public static double add(double a, double b) {

        return a + b;
    }


    public static double add(int a, double b) {

        return a + b;
    }


}
