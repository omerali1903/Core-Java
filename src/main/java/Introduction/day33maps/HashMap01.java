package Introduction.day33maps;

import java.util.HashMap;

public class HashMap01 {

    public static void main(String[] args) {

        //Example 1: Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
//           "Hello Henry!"==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String s = "bbbacc";

        System.out.println(getTheNumOfOccurenceOfLetters(s));


    }

    public static HashMap<String ,Integer> getTheNumOfOccurenceOfLetters(String s){

        //String'deki harf disi character'leri sil
        s.replaceAll("[^A-Za-z]","");

        //Gorunum sayilarini depolamak icin Map olustur.
        HashMap<String,Integer>numOfOccurence = new HashMap<>();

        //Harfleri al
      String letters[] =  s.split("");

      //for-each loop
        for (String w : letters){

          Integer numOfOcc =  numOfOccurence.get(w);

          if (numOfOcc==null){
                numOfOccurence.put(w,1);
          }else {
              numOfOccurence.put(w,numOfOcc+1);

          }
        }

        return numOfOccurence;



    }


}
