package Introduction.day13loops;

public class Loops01 {

//21 den 180 e kadar hem 4 hemde 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz

    public static void main(String[] args) {


        for (int i = 21; i < 181; i++) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
//Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
        String s = "miami";

        for (int i = 0; i < s.length(); i++) {

            String ch = s.substring(i, i + 1);

            if (i % 2 == 0) {

                System.out.print(ch.toUpperCase());

            } else {
                System.out.print(ch);
            }


            System.out.println();
        }
        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==> Hello.J
        String t = "Tokaci";

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (ch == 'a') {
                break;
            } else {
                System.out.print(ch);
            }
        }
        System.out.println();


//Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI

        String m = "miami";
        for (int i = 0;i<m.length();i++){

            String ch = m.substring(i,i+1);

            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
        }


    }




}
