package Introduction.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Lambda01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");


        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartWithT(myList);
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniiqueLowerCaseSortWithLength(myList);
    }

    //Example 1 : Bir List'teki elemanlari console'a yazdiran methodu olusturunuz.
      //1.YOL
    public static void printElements (List<String>myList){

        for (String w : myList){
            System.out.println(w+ " ");

        }

    }



    //2.YOL:
    public static void printEl (List<String>myList){
        myList.stream().forEach(t-> System.out.print(t+" "));
    }

    //Example 2:Bir list'teki t ile baslayanlar haric tum elemanlari console'a yazdiran methodu olusturunuz.

    public static void printElExceptStartWithT (List<String>myList){
        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t+" "));

    }

        //Example 3 : Bir list'teki character sayisi 4 'den az olan tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void printElLengthLessThanFour (List<String>myList){

        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.print(t+ " "));

    }

    //Example 4: Bir List'te character sayisi 4'den fazla tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.

    public static void printElLengthMoreThanFourWithUpper(List<String>myList){
        myList.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.println(t+" "));
    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.

    public static void printElLengthMoreThanFourUniqueLowerCase(List<String >myList){

        myList.stream().filter(t->t.length()>4).distinct().map(t->t.toLowerCase()).forEach(t-> System.out.println(t+" "));

    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.

    public static void printElUniqueToUpperCaseSorted(List<String>myList){
        myList.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.println(t+" "));

    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void printElUniiqueLowerCaseSortWithLength(List<String>myList){
        myList.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t+" "));
    }








}
