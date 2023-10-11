package Introduction.day07stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

    String s ="Learn Java earn money";
        // ***************** endsWith ***********************\\
  /*  endsWith () Metnin belirli bir datayla bitip bitmedigini bize verir
                  True yada false seklinde boolean bir deger dondurur.
                  Icerisine tek karakterde coklu karakterde koyabilirsiniz
    */
        //Ex : s String'inin "money" ile bitip bitmedigini kontrol ediniz



        System.out.println(s.endsWith("money"));//true

        // ******************** replace () **********************\\

        // Ex : s String'indeki "money" kelimesini "dollar" kelimesiyle yer degistirelim

        String s1 = s.replace("money","dollar");
        System.out.println("s1 = " + s1);//s1 = Learn Java earn dollar

        //Ex : String'indeki "earn" kelimesini "win" kelimesine ceviriniz
        String s2 = s.replace("earn","win");
         System.out.println("s2 = " + s2);
        // Ex: s String'indeki "a" harfini "*" ile  ceviriniz.

        String s4 = s.replace('a','*');// makbul olan budur.
        String s5 = s.replace("a","*");
//String s6 = s.replace("a","*");
        System.out.println("s4 = " + s4);//s4 = Le*rn J*v* e*rn money

// Ex: s String'indeki "L" harfini "***" ile  ceviriniz.

        String s6 =s.replace("L","***");
        System.out.println("s6 = " + s6);//s6 = ***earn Java earn money

        //EX : replace methoduyla s Stringindeki "e" harfini siliniz

        System.out.println(s.replace("e", ""));

        //EX:s String'indeki tum "earn" kelimelerini siliniz.

        String s7 =s.replace("earn","");

        String t="Dolma Kalem";
        String t1=t.replace("Kalem","Biber");
        System.out.println("t1 = "+ t1);


        //*


String str = "Ayhan BEYHAN";
        System.out.println(str.replace(str.substring(0), "AYHAN beyhan"));


    }






}
