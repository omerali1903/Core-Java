package Introduction.day09stringmanipulationsifstatement;

public class C02_IfStatement {

    public static void main(String[] args) {

        //INTERWIEW QUESTIONS USA QA

        // Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz
        //  String y = "abbccdc"
        String y = "aac";
        char ch = y.charAt(0);
        if (y.indexOf(ch) == y.lastIndexOf(ch)) {

            System.out.println(ch);
        }//if body iki curly braces arasi

        char ch1 = y.charAt(1);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }

        char ch2 = y.charAt(2);
        if (y.indexOf(ch2) == y.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        int num = 65;
        if (num > 0) {
            System.out.println("Sayi Pozitif");
        }//if
        int num1 = -65;
        if (num1 < 0) {
            System.out.println("Sayi Negatif");
        }//if


//Ex : Sayi -1 ile 10 arasida ise ekrana "verilen data rakamdir" yazdiran kodu yaziniz


        int rakam= 3;

        if (rakam>-1 && rakam<10){
            System.out.println("Verilen data rakamdir");
        }

          //Ex : Sayi 3 basamakli ise verilen data 3 basamaklidir yazdiran kodu yaziniz

        int sayi = -100;

        sayi=Math.abs(sayi);//Math.abs Sayinin mutlak degerini alir yani- de yazsak + kabul eder

        if (sayi>99 && sayi<1000){
            System.out.println("Verilen data 3 basamaklidir");
        }


















    }
}
