package Introduction.day03scanner;

public class Car {

//Variable`lar olusturalim
    public String model = "Corolla";
    public int fiyat = 20000;

    //Method`lar olusturalim
    //Not:"Return type void" oldugunda method icinde "return" keyword'u kullanilmaz
    //eger bir method yeni bir data uretmiyor ise sadece belli bir islem yapiyor ise return type'i void olur.
    public void hareket(){
        System.out.println("Corolla hizli hareket eder...");

    }
    public void dur(){

        System.out.println("Corolla guvenli bir sekilde durur...");
    }





}
