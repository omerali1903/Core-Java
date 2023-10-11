package Introduction.day12switchincrementdecrementloops;

public class Loops01 {


    public static void main(String[] args) {

     //Ekrana 5 kere "Hi" yazdiriniz
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Yukaridaki gibi tekrar gerektiren isleri yapmak icin "Loop" yapilarini kullaniriz
        //4 tane loop yapisi vardir; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //for-loop
           //Starting value Loop Condition Increment/Decrement
        for (     int i=1;  i<6          ;    i++            ){

            System.out.println("Hi");
        }


        //4'den 24'e kadar tum tamsayilari ayni satirda,aralarina bosluk birakarak console'a yazdiriniz

        for (int i=4;i<25;i++){
            System.out.print(i+" ");



        }
        System.out.println();
        //33'den 11'e kadar tum cift tamsayilari ayni satirda,bosluk birakarak console'a yazdiriniz

        for (int i =33;i>10;i--){


            if (i%2==0){

                System.out.print(i+" ");

                //20'den 74' e kadar tum tek tamsayilari ayni satirda, aralarina bosluk birakarak console'a yazdiriniz




            }

        }
        System.out.println();

        for (int i =20;i<75;i++){
            if (i%2!=0){
                System.out.print(i + " ");

            }
        }
        System.out.println();

        //"Massachusetts" kelimesindeki tum sesli harfleri console'a yazdiriniz
        String s = "Massachusetts";



        for (int i=0;i<s.length();i++){



           char c = s.charAt(i);



            if (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){



               System.out.print(c+" ");
           }

        }


    }
}
