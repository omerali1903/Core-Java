package Introduction.day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
   /*
   Method kullanirken bunlara dikkat edin
    1) O method ne iş yapar?
    2) O method nasıl kullanılır?
    3) O method size neyi verir?
    */

    public static void main(String[] args) {


        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun]

        //ArrayList'de bir elemanin ilk gorunumu nasil silinir?
        cities.remove("Miami");//true
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun]

        System.out.println(cities.remove(2));//Barcelona
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun]

        //ArrayList olustururken en basa ArrayList yerine List de yazabilirsiniz
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Example: 12 sayisini ArrayList'ten siliniz

        ages.remove((Integer) 12);

        System.out.println(ages);//[23, 7, 4]

        //Bir ArrayList'teki bir elemanin tum gorunumlerini nasil silebiliriz?

        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        System.out.println(cities.removeAll(citiesToRemove));//true

        System.out.println(cities);//[Miami]


        //Kisa yoldan bir list olusturmak icin asagidaki List.of methodu kullanilabilir.

        List<Character> initials = List.of('a', 'k', 'c', 'd');
        System.out.println(initials);//[a, k, c, d]

        List<Character> letters = List.of('a', 'k', 'c', 'd');
        System.out.println(letters);//[a, k, c, d]
        //Iki ArrayList'in birbirine esit olup olmadigini nasil anlariz?
        //equals () methodu ayni elemanlar ayni index'te oldugu surece true verir.
        boolean r1 = initials.equals(letters);
        System.out.println(r1);//true

        //indexOf('k') yazarsaniz 'k' nin ilk gorunumun indexini verir

        int r2 = initials.indexOf('k');
        System.out.println(r2);//1


        //lastIndexOf('k') yazarsaniz 'k' nin son gorunumunun indexini verir.
        int r3 = initials.lastIndexOf('k');
        System.out.println(r3);//4



        //Example 1:Bir listteki tekrarsiz elemanlari console'a yazdiran kodu yaziniz
        List<Double> prices = List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        for (Double w: prices){

            if (prices.indexOf(w)==prices.lastIndexOf(w)){

                System.out.print(w + " " );
            }

        }
        System.out.println();

        //Example 2 : Bir list'te  tekrarli eleman olup olmadigini gosteren kodu yaziniz
        List<Double> heights = List.of(2.5,1.25,2.5,3.75,1.25,4.0);
        int counter = 0;

        for (Double w:heights){



            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }


        }

        if (counter==0){
            System.out.println("All elements are unique in the list");
        }else{

            System.out.println("At least one element is not unique in the list");
        }



    }

}
