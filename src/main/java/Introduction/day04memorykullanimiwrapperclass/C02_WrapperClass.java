package Introduction.day04memorykullanimiwrapperclass;

public class C02_WrapperClass {
     /*

    Javada sonucta bir urundur.
    Oracle firmasinin bir urunudur.Developerlar sadece data
    barindiran primitve data typelarinin non - primitive ler gibi
    method 'da barindirmasini istemislerdir.Bunu uzerine Java
    primitive data type'larina method ekleyerek; ozel bir class olusturmustur.
    Bunada wrapper(sarmalamak,durum) class denir.


        Primitive               Non-Primitive
         byte         ==>          Byte
         short        ==>          Short
         int          ==>          Integer  *****
         long         ==>          Long
         float        ==>          Float
         double       ==>          Double
         boolean      ==>          Boolean
         char         ==>          Character  *****


     */
     public static void main(String[] args) {

     byte primitiveByte = 12;
     Byte wrapperByte = 12;

     //byte data type inin en buyuk ve en kucuk degerini ekrana yazdirin
         System.out.println(Byte.MAX_VALUE);
         System.out.println(Byte.MIN_VALUE);

         // EX: int data type inin maximum degeri ile byte data typeinin minimum degerinin toplami hesaplatan methodu olusturunuz
         System.out.println(Integer.MAX_VALUE + Byte.MIN_VALUE);
         int intMax = Integer.MAX_VALUE;
         byte bytemin = Byte.MIN_VALUE;

         System.out.println("Byte Max + Byte min = " +bytemin + intMax);

         //**************************** Primtive Data Type'larini Wrapper Classlara Nasil Ceviririz ********************
         float primitiveFloat = 12.33f;
         Float wrapperFloat = primitiveFloat; // buna Autoboxing denir == Otomatik Kutulama
         // Java bunu otomatik yapar kucuk kutuyu buyuk kutuya yerlestirir

         //**************Wrapper Classlari Primitive data typelarina nasil ceviririz ***********************************
         Character wrapperChar = 'a';
         char primitiveChar = wrapperChar;

         //Ex Verilen iki String datanin toplamini veren kodu yaziniz

         String str1 ="12345";
         String str2 = "987";
         System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));

         String a="K";
         int b=3, c=5, d=2;
         System.out.println(a+b*c/d);









     }









}
