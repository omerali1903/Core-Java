package practices.whileloops;

import java.util.Scanner;

public class C01_While {

// Kullanıcıdan sisteme bir rakam girmesini isteyiniz
// kullanıcının girdigi rakamin  while loop kullanarak faktoriyelini bulunuz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir rakam giriniz...");

        int rakam =input.nextInt();

        int num = 1;

        int faktoriyel = 1;

        while (num<=rakam){

          faktoriyel  = faktoriyel*num;
          num++;

        }
        System.out.println(rakam + " !=" + faktoriyel);


    }

}
