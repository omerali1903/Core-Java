package Introduction.day38enumsiterators;

import java.util.*;

/*
      1)Iterator'lar loop'larin yaptigi ayni isi yapar.
      2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
      3)Iterator'lar ile loop'lar arasinda performans farki yoktur.
      4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basarilidir.
      5)Iki tip iteraror var; i)Iterator: Bu sadece eleman silmede kullanilir,
                                          eleman eklemek veya elemani degistirmek mumkun degildir.
                              ii)ListIterator: Bu eleman silebilir, ekleyebilir veya degistirebilir.
                              Note:"Iterator" sadece soldan saga (ilk elemandan son elemana) calisir.
                                   "ListIterator" ise iki yonlu calisabilir.
   */
public class Iterators01 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

        //Iterator kullanalim
        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()) {//hasNext() pointer'a "Senden sonra eleman var mi ?"diye sorar.
            //Eleman varsa "true" yoksa "false" return eder.

            myItr.next();//next()pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.


            myItr.remove();//next()methodun return ettigi elemani siler.

        }
        System.out.println(myList);//[]

        //listIterator kullanalim

        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");

        System.out.println(yourList);

        ListIterator<String> yourlistItr = yourList.listIterator();

        while (yourlistItr.hasNext()) {

            String el = yourlistItr.next();

            yourlistItr.set(el + "!");//set() method'u list'i update etmeye yarar.
        }
        System.out.println(yourList);

        //hasPrevious() ve previous () nasil kullanilir?

        while (yourlistItr.hasPrevious()) {
            String el = yourlistItr.previous();
            System.out.println(el);

            yourlistItr.set("?" + el);
        }
        System.out.println(yourList);


        //En sondan en basa nasil iterate edebiliriz?
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();//descendingIterator() ancak LinkedList ile kullanilabilir.

        while (ourListItr.hasNext()) {

            String el = ourListItr.next();

            System.out.println(el);
        }


    }


}
