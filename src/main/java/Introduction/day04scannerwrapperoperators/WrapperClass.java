package Introduction.day04scannerwrapperoperators;

public class WrapperClass {

    public static void main(String[] args) {

    //primitive    :char     -boolean-byte-short-  int-  long-float-double
    //Wrapper Class:Character-Boolean-Byte-Short-Integer-Long-Float-Double

    //Wrapper Class'lar non-primitive'dir o yuzden memory'de cok yer kaplarlar
    //o yuzden sart degilse wrapper class kullanmayi tercih etmeyiz
    //boyle bir imkanin varligindan da haberdar olmaliyiz

    // "n" yazip "nokta" koyarsaniz hic method goremezsiniz, cunku "primitive"'ler method icermez

        int n = 12;
        //"m" yazip "nokta" koyarsaniz bir cok method gorebilirsiniz, cunku wrapper class'lar method icerir.
        Integer m= 12;

        byte p = 13;
        Byte r = 13;

        //Ornek 1 : short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort =Short.MIN_VALUE;
        System.out.println(minShort);

        //Ornek2: int data type'inin minimum degeri ile byte data type'inin maximum degerinin toplamini bulunuz
        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInt + maxByte);

        //Ornek 3 : 1)Primitive int'i wrapper Integer'a ceviriniz
        int num = 13 ;
        Integer wrapperNum = num;

        //primitive yani method bulunmayan bir kutudaki degeri alarak icinde bazi methodlar bulunan wrapper kutuya atama yaparsak bu islem "auto-boxing" denir.

        //2) Wrapper Byte'i primitive byta'a ceviriniz.
        Byte k = 33;
        byte primitiveK = k;
        //wrapper bir kutu icinde bazi methodlarla birlikte bulunan degeri alarak
        //primitive yani method bulunmayan bir kutuya atama yaparsak bu islem "un-boxing" denir.

        //Ornek 4 : 1)Primitive char'i Wrapper Character'e ceviriniz(Autoboxing)
        char primChar = 'a';
        Character wrapperChar = primChar;
        //2) Wrapper Boolean'i primitive boolean'a ceviriniz.(Unboxing)

        Boolean wrapperBoolean = true;
        boolean primitiveBoolean = wrapperBoolean;








    }


}
