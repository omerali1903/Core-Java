package Introduction.day13loops;

public class Loops01Tekrar {
//21 den 180 e kadar hem 4 hemde 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz

    public static void main(String[] args) {

        for (int i = 21; i < 181; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab"==>P12?A


        String a = "Pwd12?Ab";
        for (int i = 0; i < a.length(); i++) {

            char ch = a.charAt(i);

            if (ch >= 'a' && ch <= 'z') {


            } else {
                System.out.print(ch);
            }

        }

        System.out.println();


        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==> Hello.J

        String str = "Hello Java";

        for (int i = 0 ;i<str.length();i++){
           char ch = str.charAt(i);

           if (ch=='a'){
               break;
           }else {
               System.out.print(ch);
           }



        }


        //Bir String'i ters ceviren kodu yaziniz
        //"Java"==> "avaJ"
        String b = "Selamlar";
        String ters = "";

        for (int i =b.length()-1;i>=0;i--){

            ters = ters + b.substring(i,i+1);

        }
        System.out.print(ters);

        System.out.println();




        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 =20


        int sum = 0 ;

        for (int i = 578;i>0;i=i/10){

            sum = sum+i%10;

        }
        System.out.print(sum);



    }
}
