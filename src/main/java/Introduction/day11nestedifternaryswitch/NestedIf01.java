package Introduction.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {
     /*
Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz

 */
    /*
1) "If" icinde "if" kullanirsaniz, "nested if" olusturmussunuz demektir.
2) "nested if" Java'yi yavaslatir bu yüzden mecbur kalmadikca kullanmayiz.
3) "nested if" gibi Java'yi yavaslatan kodlar "Time Consuming" olarak adlandirilir.
 */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your age...");
        int age = input.nextInt();

        System.out.println("Please enter your gender...");//male ,female
        String gender = input.next();
        if (age<0 || age>120){
            System.out.println("Negative ages or ages greater than 120 are invalid");

        }else if (gender.equalsIgnoreCase("male")){ //equalsIgnoreCase icine koydugumuz stringi nasil yazarsak yazalim kabul eder "male,MALe,MaLe,Male" gibi
            //Sadece equals yazarsak icine koydugumuz gibi birakir yani bu durumda sadece "male" kabul eder eger Male yazarsak olmaz

            if (age>65){
                System.out.println("Can be retired");
            }else {
                System.out.println("Should work");
            }

        }else if (gender.equalsIgnoreCase("female")){
            if(age>60){
                System.out.println("Can be retired");
            }else {
                System.out.println("Should work");
            }

        }else {
            System.out.println("Undefined gender");
        }






    }

}
