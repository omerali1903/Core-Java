package Introduction.day08stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {

    public static void main(String[] args) {

        /*
Kullanicidan email adresini girmesini isteyin,
Asagidaki kurallara gore kullanicinin
girdigi email adresini kontrol ediniz.
       i)mail adresi "gmail" icermeli

       ii)Space characteri mail'de olmamali
       iii)mail adresinde buyuk harf olmamali
       iv)En az bir tane noktalama isareti bulunmali
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen asagidaki kurallara uyarak mail adresini yaziniz " +
                "i)mail adresi \"gmail\" icermeli\n" +
                "       ii)Space characteri mail'de olmamali\n" +
                "       iii)mail adresinde buyuk harf olmamali\n" +
                "       iv)En az bir tane noktalama isareti bulunmali");

        String mail = input.nextLine();

        //mail adresi "gmail" icermeli
        boolean gmail = mail.contains("gmail");
        System.out.println("gmail icermeli : " + gmail);

        //ii)Space characteri mail'de olmamali
        boolean space = !mail.contains(" ");
        System.out.println("space olmamali : " + space);

        //iii)mail adresinde buyuk harf olmamali
        boolean third = mail.replaceAll("[a-z0-9]", "").
                replaceAll("[\\p{Punct}]", "").replace(" ", "").length() == 0;
        System.out.println(third);

        //iv)En az bir tane noktalama isareti bulunmali
        boolean fourth = mail.replaceAll("[a-zA-Z0-9]", "").replace(" ", "").length() > 0;
        System.out.println("bir noktalama isareti" +fourth);

        boolean fourth1 = mail.replaceAll("[^\\p{Punct}]","").length()>0;//[^\p{Punct}] semboller haric herseyi sil
        System.out.println("bir noktalama"+fourth1);

        boolean fourth2 = mail.replaceAll("[\\p{P}]","").length()>0; //"[\\p{P}]" semboller haric herseyi sil
        System.out.println("bir noktalama " + fourth2);

        System.out.println("mail adresi uygun " + (gmail && space && third && fourth &&fourth1 &&fourth2));




    }

}
