package practices.day06;

import java.util.Arrays;

public class C01_Array {

    public static void main(String[] args) {

 /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        output: min:-90, max:10001, ikincimax: 8787

       */

        int[]arr ={100,10001,-90,845,8787,898,0,1};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(arr);

        System.out.println("Minimum"+arr[0]);
        System.out.println("Maximum"+arr[arr.length-1]);

        System.out.println("Ikinci Maximum"+arr[arr.length-2]);


    }



}
