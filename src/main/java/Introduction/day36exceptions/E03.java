package Introduction.day36exceptions;

public class E03 {

    public static void main(String[] args) {

        printAge(23);
        printAge(-12);

    }

    public static void printAge (int age){

        if (age<0){
            throw new IllegalArgumentException();

        }
        System.out.println(age);
    }

}
