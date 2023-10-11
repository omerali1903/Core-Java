package Introduction.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch01 {

    /*
         Ay numarasi verildiginde ay'in ismini console'a yazdiran kodu yaziniz.
     */
    /*
      Note: switch parantezi icerisinde "String","int","byte","short" ve "char" kullanabilir.
           "boolean","float","double","long"
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ayi sayi olarak giriniz");
        byte monthNumber = input.nextByte();

        switch (monthNumber){

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }






    }


}
