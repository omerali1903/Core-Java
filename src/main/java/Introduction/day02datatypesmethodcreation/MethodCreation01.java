package Introduction.day02datatypesmethodcreation;

public class MethodCreation01 {
 /*
 java`da method nasil olusturulur?

 1)main method'un disinda class'in icinde olusturulur
 2)Access Modifier + Return type + Method ismi + () + {}

   Olusturulan methodlar nasil kullanilir?
   1) main method`un icinden kullanilir
   2)method'un ismi + () yazin
   3)Islem yapacaginiz parametleri parantez icine koyun
  */
 public static void main(String[] args) {
 int sonuc = toplamaYap(3,5);
     System.out.println("Toplama Sonucu = " + (sonuc));

     long carpmaSonucu = carpmaYap(3,6);
     System.out.println("Carpma Sonucu = " + (carpmaSonucu));

     int carpmaToplamaSonucu= ikiCarpmaBirToplama(5,4,3);
     System.out.println("Carpma toplama sonucu = " + (carpmaToplamaSonucu));

     double kupuAlmaSonucu= kupuAl(18);
     System.out.println("18 un kupu = " + (kupuAlmaSonucu));

     yazdir("Hello World");

     yazdirma("Selam Dunya");




 }
 //Ornek 1: toplama islemi yapan bir method olusturunuz
    // main method static oldugu icin main method icerisinde kullanacaginiz hersey static olmalidir

public static int toplamaYap (int a, int b)  {
    return a+b;
}

// Ornek 2 : 2 sayiyi carpma islemi yapan bir method olusturunuz
    protected static long carpmaYap(int a, int b) {
    return a*b;

    }
    //Ornek 3 : Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu ile toplayan methodu olusturunuz

    private static int ikiCarpmaBirToplama(int a,int b, int c){
     return a*b+c;


    }

    //Ornek 4 : Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz
    //Not: ACCESS MODIFIER'I default YAPMAK icin access modifier YAZMAYINIZ

     static double kupuAl (double a){

     return a*a*a;


 }
    //Ornek 5 : Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
    public static void yazdir (String str){
        System.out.println(str);
        //Methodun return type i void ise method body icinde return keyword yazilmaz.
        //eger bir method yeni bir data uretmiyor ise return type i void olur.



    }
    public static void yazdirma (String sinan){
        System.out.println(sinan);

    }




}
