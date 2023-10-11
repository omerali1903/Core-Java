package Introduction.day21datetime;

public class Varargs01 {

    public static void main(String[] args) {


        System.out.println(add(5,2,4,3));

        getInitials("Ali Can","Kemal Han","Tuncay Cinar","Ibrahim Catal");


    }


    //Toplama islemi yapan bir method olustur
    //Asagidaki gibi farkli method'lar olusturarak is yapamayiz
    //Cunku kullanici farkli sayidaki sayilari toplamak isteyebilir, her ihtimal icin bir method olusturmak mumkun degildir
   // public int add(int a, int b){
     //return    a+b;

    //}

    //public int add(int a ,int b ,int c){
      // return a+b+c;
    //}

    //public int add(int a ,int b ,int c,int d) {
      //  return a + b + c + d;
    //}

    // Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu
    // Bu yapiya "Varargs" denir.
    //"Varargs" arkada "Array" yapisini kullanir

    /*
    1) Bir method parantezinde bir'den fazla "Varargs" kullanilamaz
    2) Bir method parantezinde bir'den fazla parametre kullanilacaksa "Varargs" en sonda olmalidir.

     */

    public static int  add (int...a){

        int sum = 0;
        for (int w : a){
            sum = sum+w;
        }
        return sum;
    }

    //Example 2: Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
    //                   Ali Can ==> AC        Kemal Han==> KH

    public static void getInitials (String... s){

        String initials = "";

        for (String w: s){

         initials =   initials +w.substring(0,1) + w.split(" ")[1].substring(0,1);

            System.out.println(initials);

            initials = "";

        }
    }






}
