package practices.day03;

import java.util.Scanner;

public class C04_SwitchCase {

      /*

Bir restoranda, müşteriler menüden yemeklerini seçerler.
Restoran, müşterilerin seçtiği yemeği pişirmek için bir
program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
belirlendigi bir program yaziniz

Hamburger==200 Tl Pizza ==300 tl Doner== 150 tl

*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir yemek seçin:");
        System.out.println("Hamburger");
        System.out.println("Pizza");
        System.out.println("Doner");
        String choice = input.next().toLowerCase();

        switch (choice){

            case "hamburger":
                System.out.println("Hamburgerin fiyati 200 TL'dir ");
                break;
            case "pizza":
                System.out.println("Pizzanin fiyati 300 tl'dir ");
                break;
            case "doner":
                System.out.println("Donerin fiyati 150 tl 'dir ");
                break;
            default:
                System.out.println("Oyle bir yemegimiz bulunmamaktadir");
        }

         /*
             Bir arac kiralama sitesinde secilen araba markasina gore degisen kiralam ucretine gore
             Toplam odenecek fiyati gostern kodu yaziniz
             SUV ==>500
             SEDAN ==> 400
             HATCBACK ==> 350
             geriye kalanlar ==>300 TL


              */

        System.out.println("Lutfen araba markasi seciniz");
        System.out.println("1-SUV");
        System.out.println("2-SEDAN");
        System.out.println("3-HATCBACK");
        String carChoice = input.next().toLowerCase();
        System.out.println("Lutfen kiralanacak gun sayisini yaziniz");
       int kiralanacakGun = input.nextInt();


        switch (carChoice){

            case "suv":
                int kiralamaUcreti = 500;
                int suvkiralama = kiralamaUcreti*kiralanacakGun;

                System.out.println("Odenecek tutar = " + suvkiralama);
                break;

            case "sedan":
                int kiralamaUcretiSedan = 400 ;
                int sedanKiralama = kiralamaUcretiSedan*kiralanacakGun;

                System.out.println("Odenecek tutar = " + sedanKiralama);
                break;
            case "hatcback":

                int kiralamaUcretiHatchback = 350;
                int hatchbackKiralama = kiralamaUcretiHatchback*kiralanacakGun;

                System.out.println("Odenecek tutar = "+hatchbackKiralama);
                break;

            default:
                int geriyeKalanArabalar =300;
                int kalanKiralama =geriyeKalanArabalar*kiralanacakGun;

                System.out.println("Geriye kalan arabalarin ucreti = "+kalanKiralama);



        }
        /*
Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
kontrol eden bir program yaziniz
 */

        System.out.println("Lütfen beslemek istediğiniz hayvanın ismini yazın:");
        String animal = input.nextLine();

        switch (animal) {
            case "fil":
                System.out.println("Robot filin yanına gitti ve yemek verdi.");
                break;
            case "aslan":
                System.out.println("Robot aslanın yanına gitti ve yemek verdi.");
                break;
            case "zebra":
                System.out.println("Robot zebranın yanına gitti ve yemek verdi.");
                break;
            default:
                System.out.println("Maalesef beslemek istediğiniz hayvan mevcut değil.");
        }

















    }








}
