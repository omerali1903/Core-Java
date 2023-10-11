package Introduction.day03scanner;

public class Runner {

    public static void main(String[] args) {

     //Object nasil olusturulur?
     //Class ismi + Object ismi + Atama operatoru + "new"  + Constructor
     Car              myCar              =           new        Car();

     //"new" keyword'u sifirdan yeni bir object olusturmak icin kullanilir.
     // Consturctor Java'da nesneleri olusturmak icin kullanilan ozel bir methoddur.
        System.out.println( "Arabanin fiyati ="+myCar.fiyat );
        System.out.println("Araba modeli = " + myCar.model);

        myCar.hareket();

        myCar.dur();

      Student tomHanks = new Student();

        System.out.println("Name = " + tomHanks.name);
        System.out.println("Grade = " + tomHanks.grade);
        System.out.println("Address = " + tomHanks.address);
        tomHanks.feed();
        tomHanks.study();


    }
}