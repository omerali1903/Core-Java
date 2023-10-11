package Introduction.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {
        //Example 1: Type code to print the number of occurrences of words in a sentence
//"I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1

        String s = "I like you, like like";
        System.out.println(s);

        //like ile like! i ayni yapabilmek icin tum noktalama isaretlerini silelim.
        s=s.replaceAll("\\p{Punct}","");
        System.out.println(s);

        //Ben kelimelerle calismaliyim bu yuzden split(" ") kullanacagim

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> occ = new HashMap<>();

        //"words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
//"words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
//"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for (String w : words){

          Integer numofOccurrence =  occ.get(w);

          if (numofOccurrence==null){

              occ.put(w,1);
          }else{
              occ.put(w,numofOccurrence+1);
          }


        }

        System.out.println(occ);




    }

}
