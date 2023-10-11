package Introduction.day13loops;

public class Loops02 {

    public static void main(String[] args) {

    //Verilen bir String'de kucuk harfleri console'a yazmayiniz
    //"Pwd12?Ab"==>P12?A

        String s = "Pwd12?Ab";

        for (int i=0; i<s.length();i++){

            char ch =s.charAt(i);

            if(ch>='a' && ch<='z'){

                continue;//Loop yaparken bazi elemanlari isleme sokmamak icin "continue" kullanilir.
            }else{
                System.out.print(ch);
            }
        }


       //"Break" ile "continue" arasindaki fark nedir?
        // "Break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
        //"continue" ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.
        System.out.println();



        //Bir String'i ters ceviren kodu yaziniz
        //"Java"==> "avaJ"
//1.way
        String t = "Apex";
        String ters = "";

        for (int i=t.length()-1;i>=0;i--){

           ters = ters + t.substring(i,i+1);

            System.out.println(ters);

        }


//2.way

        String u = "Java";
        String ters2 = "";

        for (int i=u.length()-1; i>=0;i--){
            ters2=ters2+ u.charAt(i);

        }
        System.out.println(ters2);



//Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 =20
        int sum =0;

        for (int i =578;i>0;i=i/10){

            sum=sum+i%10;
        }
        System.out.println(sum);


























    }



}
