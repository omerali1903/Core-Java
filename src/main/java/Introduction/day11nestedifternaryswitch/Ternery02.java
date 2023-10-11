package Introduction.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternery02 {

    public static void main(String[] args) {

        /*
              Kullanicidan bir sayi aliniz. o sayi pozitif ise ekrana "Pozitif" yazdirin degilse ekrana "Pozitif degil" yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
       int number = input.nextInt();

       String result = number>0 ? "Pozitif" : "Pozitif degil";
        System.out.println(result);




    }



}
