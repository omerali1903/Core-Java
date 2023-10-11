package Introduction.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternery01 {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integers...");

        int first = input.nextInt();
        int second = input.nextInt();

        //1.Yol : Use if else
        if (first<second){
            System.out.println(first);
        }else{
            System.out.println(second);
        }

        //2.Yol:Use Ternary
        int result = first<second ? first :second;
        System.out.println(result);

    }





}
