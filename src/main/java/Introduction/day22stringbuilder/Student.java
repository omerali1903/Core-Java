package Introduction.day22stringbuilder;

public class Student {

    //StdName "public" oldugu icin diger class'lardan ulasilabilir
public  String stdName = "Ali Can";

     //Acces Modifier'i "default" olan ile "public" olan class member'lar ayni package icinde
    //kullandiklarinda ayni ozellikleri gosterirler.
    //fakat farkli package'a gectiginizde,"public" olanlara ulasilabilir, "default" olanlara ulasilmaz.
int age =23;

//Acces modifier'i "private" olan Class Member'lar sadece olusturulduklari class icinden gorulebilirler
private String healthCondition ="Cancer";

//Acces Modifier'i "protected" olan Class Member'lar ayni package icinde iken "public" gibi davranirlar

    protected int salary = 3000;

}
