package Introduction.day03scanner;

//java`nin util kutuphanesinden scanner class import edildi demektir.

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1.adim : Scanner Class`tan bir obje olustur
        Scanner input = new Scanner(System.in);

        //obje ismini input yaptik cunku bu object kullanicidan alinan datayi benim kodlarimin icine koyacak

        //2.adim kullaniciya ne istediginize dair mesaj veriniz

        System.out.println("Lutfen yasinizi giriniz...");

        //3.adim Uygun method'u kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz

       byte age = input.nextByte();
        System.out.println(age);



    }


}
