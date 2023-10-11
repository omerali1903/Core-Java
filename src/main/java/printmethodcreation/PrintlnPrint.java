package printmethodcreation;

import java.util.Scanner;

public class PrintlnPrint {

    public static void main(String[] args) {


        //"TECHPRO EDUCATION" yazisini yukaridan asagiya her bir harf bir alt satirda olucak sekilde yaziniz
        //1.Yol tek tek yazmak
        //CTRL + D ==> windows
        //cmd + D ==>Mac

        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" "); //Bosluk icin
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        //ikinci yol
        //"TECHPRO EDUCATION" yazisini yukaridan asagiya her bir harf bir alt satirda olucak sekilde ve tek sout kullanarak yaziniz

        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");
        //JAVA ILE GUZEL DUNYA cumlesinin her bir kelimesini alt satirda yazdiran kodu tek bir sout ile yaziniz

        System.out.println("JAVA\nIle\nGuzel\nDunya");

        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelime arasinda 1 tab bosluk birakan
        //  kodu yaziniz

        System.out.println("JAVA\tILE\t\tGUZEL\tDUNYA");

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz

        System.out.println("\"Techpro\" ile java cok \'kolay\'");

        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"

        System.out.println("\"MAHARET\" hic 'DUSMEMEK' degil ;\n\n\n\t \"Her dustugunde kalkabilmektir\" ");

        // Soru4)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
          /*
          A
         A A
        A A A
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz");
        char ch = input.next().charAt(0);

        System.out.println("  "+ch+" ");
        System.out.println(" "+ch+" "+ch+ " ");
        System.out.println(ch+" "+ch+" "+ch );







    }


}
