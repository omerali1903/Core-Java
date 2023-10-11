package Introduction.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch02 {

    /*
      Kullanicidan aldiginiz character'i sesli harf olup olmadiğini kontrol eden kodu yaziniz.
      (a-e-i-o-u)
       */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter = input.next().toLowerCase().charAt(0);

        switch (letter){

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");

        }

    }
}
