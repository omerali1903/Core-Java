package Introduction.day25polymorphism;

public class Student {

    //Encapsulation: Data saklamaktir. (Data hiding)
    //Data'yi nasil saklarsin? Access Modifier'ini "private" yaparak.
    //Ozel datalarin butun class'lara acik olmasini engellememiz gerekir. Cunku bir data tum classlara aciksa hacklenebilir
    //i)get method'lari hep "public" olur ii)get method'un "return type"i okudugu variable'in return type'i ile ayni olur.
    //iii)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar

    public String stdName = "Tom Hanks";

    public int age = 23;

    private String stdId = "AC2023102T";

    private double gpa = 3.87;

    private  boolean successful = false;

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz
    //Nasil okuruz? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.


    public String getStdId(){
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    //Encapsulation yapilan variable'in data type'i "boolean" ise get method ismi "is" ile baslar

    public boolean isSuccessful() {
        return successful;
    }

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan degistirebiliriz
    //Nasil degistirebiliriz? "set method" olusturarak Encapsulate edilmis data'nin degerini degistirebiliriz.
    //i)set method'lari hep "public" olur ii)set method'un "return type"'i hep "void" olur.
    //iii)set method parametre kullanir, parametre'nin data type'i variable ile ayni olur.
    //iv)set method kullanarak varolan object uzerinde degisiklikler yaparak o object'mis gibi kullanabiliriz
    //Note : getmethod'larin diger adi "getter",set method'larin diger adi "setter"dir.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
