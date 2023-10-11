package Introduction.day42lambda;

import Introduction.day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {



    private static List<Integer> swap(int starting, int ending){
        List<Integer> list = new ArrayList<>();
        if(starting>ending){//ilk değer ikinci değerden büyükse rangeClosed() hata verir bu yüzden verilen değerleri swap yapmak gerekir
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }

    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(7, 10));

        System.out.println(getMultiplicationInTheGivenRange(7, 10));

        System.out.println(getSumOfDigitsInTheGivenRange(45, 47));


    }



    //Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz

    public static int getSumInTheGivenRange (int starting , int ending){

      List<Integer>list =swap(starting,ending);

       return IntStream.rangeClosed(starting,ending).sum();
    }

    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.

    public static int getMultiplicationInTheGivenRange(int starting , int ending){

      List<Integer> list = swap(starting,ending);
      return  IntStream.rangeClosed(starting,ending).reduce(Math::multiplyExact).getAsInt();
    }

    //Example 3 : 45'den 47'e kadar tamsayilarin rakamlari toplamini hesaplayan methodu olusturunuz. 4+5+4+6+4+7

    public static int getSumOfDigitsInTheGivenRange(int starting, int ending){
       return IntStream.rangeClosed(starting,ending).map(Utils::getSumOfDigit).sum();
    }






}
