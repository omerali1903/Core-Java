package Introduction.day03methodcreationscanner;

public class C03_MethodCreation {


    public static void main(String[] args) {

// Verilen iki sayiyi toplayan methodu yaziniz

    toplamaYap(30,88);

    //Verilen iki sayiyi carpan methodu yaziniz

        carpmaYap(18 ,44);
        //Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplanan methodu olusturunuz ve kullaniniz

        ikiCarpmabirToplama(18 ,14 ,13);

        sayininKupu(5.6);




    }










private static void toplamaYap(int a,int b){

    System.out.println("Toplama sonucu = " +(a+b));
}


public static void carpmaYap(int a , int b ){

    System.out.println("Carpma sonucu = "+(a*b));
}
public static void ikiCarpmabirToplama (int a ,int b ,int c){

    System.out.println("Sonuc = " + (a*b+c));

}
static void sayininKupu (double a){

    System.out.println("Sayinin kupu : "+(a*a*a));
}














}
