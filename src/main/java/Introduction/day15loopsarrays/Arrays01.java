package Introduction.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

//1) Array, Java'dan ayni data tipinde coklu data depolamak icin olusturdugu bir yapidir

        // Array nasil olusturulur
        String stdNames[] =new String[5];

        //Array'e nasil eleman eklenir
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames [1]= "Ayhan";
        stdNames [4] = "Filiz";

        //Array nasil yazdirilir ?
        System.out.println(Arrays.toString(stdNames));


        //Array'deki spesifik bir elemani nasil alabiliriz?
        System.out.println(stdNames[3]);

        //Example 1 : stdNames arrayindeki her ismin sonuna yildiz koyarak konsola yazdiriniz
        //1.Way

        for (int i =0;i<stdNames.length;i++){

            System.out.println(stdNames[i] + "*");

        }
        //2.Way for-each loop ==> Enhanced loop- Mumkunse herzaman for-each loop kullanin
        for (String w :stdNames){
            System.out.println(w + "*");
        }

        //Example 2 : Bir Integer Array olusturunuz. 5 eleman ekleyiniz, elemanlarin toplamini bulup konsola yazdiriniz

        int eleman[] = new int[5];
        eleman[4]=10;
        eleman[3]=8;
        eleman[2]=4;
        eleman[1]=90;
        eleman[0]=1;

        int sum = 0;

        for (int w :eleman){

            sum =sum+w;

        }

        System.out.println(sum);
        //Example 3: Bir char Array olusturunuz, 3 eleman ekleyiniz, elemanlarin carpmini bulup console'a yazdiriniz

        char uc [] =new char[3];
        uc[0]='J';
        uc[1]='P';
        uc[2]='A';

        int carpim =1;

        for (char w: uc){

            carpim=carpim*w;

        }

        System.out.println(carpim);






























    }






}
