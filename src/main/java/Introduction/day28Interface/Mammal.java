package Introduction.day28Interface;




/*    Child    Parent
    1)Class--> Class : extends
      interface--> interface : extends
      Class--> interface : implements
      interface --> Class : Olamaz...
      Ayni ise "extends" farkli ise "implement" kullaniriz.
      "interface" i Class'in child'i yapma.

    ABSTRACT CLASS ILE INTERFACE ARASINDAKI FARKLAR:

1. METHOD OLARAK FARKLAR:
i) Abstract classlar hem abstract hem de concrete methodlar icerebilirler interfaceler ise sadece abstract class icerir.
ama interfacelerde istersek default ve static keywordlerini kullanarak concrete method uretebiliriz.
ii) Abstract classlar multiple inheritance i desteklemez ama interfaceler destekler

2. VARIABLE OLARAK FARKLAR:

i)Abstract classlar icinde her turlu variable olusturulabilir. interfacelerde variablelar public static ve final olmak zorundadir.
ii)Interface, classin child i olamaz ama abstract, classin child i olabilir

abstract class'larda constructor vardir ama object uretemez, interface'lerde constructor yoktur bu yuzden object uretilemez.
 */

public interface Mammal extends Animal{


String feedBaby = "Milk";

int age  =6;

}
