package Introduction.day14loops;
import java.util.Scanner;
public class Loops03 {

    public static void main(String[] args) {

//Kullanici bir sayi girsin sayi 100 den kucuk ise kullanici "kazandiniz" mesaji alsin
//diger durumlarda" kaybettiniz" mesaji alsin

        Scanner input = new Scanner(System.in);



        do{
            System.out.println("Please write a number but what do you want ");
            int n = input.nextInt();

            if(n<100){
                System.out.println("Smart guy you won");
            }else{
                System.out.println("You dont have enough luck sorry dude");
                break;
            }
        }while(true);

        //Kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz

        do{

            System.out.println("Please enter a word");
            String s = input.next();

            if(s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct grammatically");
            }else{
                System.out.println("Your sentence has grammatical mistake");
                break;
            }

        }while(true);




    }
}
