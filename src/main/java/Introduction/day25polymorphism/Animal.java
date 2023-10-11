package Introduction.day25polymorphism;

public class Animal {

    /*
    1)Parent'taki method ile Child'da Overrida edilen method'un access modifier'i ayni olabilir
    2)Child'da Overrida edilen method'un access modifier'i ayni olabilir Parent'taki access modifier'dan dar olamaz
    3)Parent'taki method'un access modifier'i Child'da Overrida edilen method'un access modifier'indan dar olabilir

    4)Method'un return type'i "primitive" ise Overriding yapildiginda "return type" degistirilemez.
    5)Method'un return type'i "void" ise Overriding yapildiginda "return type" degistirilemez.

    6) Child'da Override edilen method'un "return type"i ile Parent'taki method'un "return type"i arasinda "IS-A"
    iliskisi varsa "return type" degistirilebilir. Aksi takdirde degistirilemez.
    Mesela; Integer Wrapper Class ile Long Wrapper Class arasinda "IS-A" iliskisi yoktur, o yuzden return type Integer oldugunda Long'a degistirilemez.

    7) Return type Wrapper Class oldugunda, Overriding yaparken "return type" degistirilmez.

    8)"final method"'lar Override edilemezler.
      "final method"'larin body'si degistirilemez ama Override ederken method body'i degistiririz bu bir celiskidir.
      Bu yuzden Java "final method" larin Override edilmesine musaade etmez.

   9) "static method"lar Override edilemezler.Cunku "static method"'lar tum Child'lar icin ortak method'lardir.
      Bir Child ortak method'u degistirdiginde diger Child'lar bundan etkilenir.Bu etkilenme ummadik sonuclar ortaya cikarabilir.
      bu yuzden Java "static method"'larin Override edilmesine musaade etmez.

      10)"private method"'lar Override edilemez.

 */

public void move (){
    System.out.println("Animals move...");
}

protected int add (int a,int b){

    return a+b;
}

public Animal create (){
    return new Animal();
}

public Integer multiply(Integer a,Integer b){
    return a*b;
}

public final double circleArea (double r){

    return 3.14*r*r;

}



}
