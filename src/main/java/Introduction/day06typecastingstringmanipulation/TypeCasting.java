package Introduction.day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {
      /*
       Explicit Narrowing yaparken dikkat edilmeli .
        Cunku Cok Ciddi Data kaybi hatta Datanin degismesine neden olabilir.
        Eger sayimiz donusturmeye calistigimiz variable'in sinirlari
        disinda ise; Java sayiyi mod islemine alir ve kalani yazdirir.
        Kalan bolenin yarisindan fazlaysa kalan sayiyi Java kucultmek ister ve
        bolumu 1 buyuterek kalani (-)isaretli olacak sekilde yazdirir


*/


        short num = 260;
        byte numByte = (byte) num;
        System.out.println("numByte = " + numByte);//4


        //byte sinirlari -128 le 127 arasi oldugu icin numarada 260 oldugu icin
        //127+128+1(0 i 1 data olarak goruyoruz) = 256 olur sayida 260 oldugu icin 260/256
        //                                                                         -256  1
        //                                                            Kalan      =    4
        // yani 4 kalan kismindaki kismi ekrana yazdirir


        short num2 = 1023;
        byte num2Byte = (byte) num2;

        System.out.println("num2Byte = " + num2Byte);//-1
        /*

               1023/256
               1024     4
         Kalan   -1


        */
        short num3 = 1000;
        byte num3Byte = (byte) num3;
        System.out.println("num3Byte = " + num3Byte);//-24
        /*
                   1000/256
                   1024  4
            Kalan   -24



         */

        int intSayi = 8880;
        short shortSayi = (short) intSayi;
        System.out.println("shortSayi = " + shortSayi);//8880


    }


}
