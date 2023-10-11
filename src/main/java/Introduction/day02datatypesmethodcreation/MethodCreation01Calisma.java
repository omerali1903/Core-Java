package Introduction.day02datatypesmethodcreation;

public class MethodCreation01Calisma {

    public static void main(String[] args) {


    int toplamaSonucu = (ToplamaIslemi(4,5,9,4));
        System.out.println(toplamaSonucu);




int cikarmaIslemiSonucu =(cikarmaIslemi(19,14,13,19));
        System.out.println(cikarmaIslemiSonucu);



double carpmaSonucu = (carpmaIslemi(528,929));
        System.out.println(carpmaSonucu);





yaziYazma("Omer Ali Kaya");

    }



public static int ToplamaIslemi(int a,int b,int c,int d){
  return a+b+c+d;

    }


static int cikarmaIslemi (int a,int b,int f, int g){

  return a-b-f-g;

}




private static double carpmaIslemi (double a,double b){

   return a*b;
}




public static void yaziYazma(String Omer){

    System.out.println(Omer);
}









































}
