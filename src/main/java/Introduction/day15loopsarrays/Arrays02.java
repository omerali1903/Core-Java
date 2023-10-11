package Introduction.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        /*
        1)Application'larda "data" ile bu data'lari isleyen kod'lar(Logic) birbirinden ayrilir.
  Yani; logic data'ya bagimli olmamalidir.
  Data'ya bagimli olarak yazilan kod'lara "hard code" denir.
  "hard code" hatali kod demektir.

  Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
  "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
  kullanirsaniz hep dogru sonucu alirsiniz
         */


        //Arrayleri kisayoldan nasil olusturabiliriz?

        int grades[] = {67, 98, 100, 34, 76};

        System.out.println(Arrays.toString(grades));

        //Ex 1 : grades array'indeki en kucuk ve en buyuk grade'in toplamini ekrana yazdirian kodu yaziniz

        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));

        System.out.println(grades[0] + grades[grades.length-1] );

        //EX:2 Size verilen bir string arraydeki isimlerden 5 karakterden az karakter icerenleri console a yazdiriniz
        String stdNames[] =new String[5];


        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames [1]= "Ayhan";
        stdNames [4] = "Filiz";


        System.out.println(Arrays.toString(stdNames));

        for (String b : stdNames){

            if (b.length()<5){
                System.out.println(b);
            }
        }


    }
}
