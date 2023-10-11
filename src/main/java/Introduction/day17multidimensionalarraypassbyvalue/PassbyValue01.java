package Introduction.day17multidimensionalarraypassbyvalue;

public class PassbyValue01 {
    /*
Method olusturmak icin asagidaki 5 adimi takip ediniz.
   1)Access Modifier
   2) Return Type
   3) Method ismi
   4)Method Parantezi
   6) Methodun body'si
   */

    /*
    pass by value
    1-java "pass by value" kullanir
    2- java methodlarin orijinal degeri degistirmesine musaade etmez
    3-java methodlara deger yolarken orijinal degerin kopyasini olusturur
    ve o kopyayi methoda yollar, method da kopya uzerinde degisiklik yapar
    java bunu yaparak orijinal degeri korur.
    4-java esnek bir dildir. istersek yazdigimiz kod ile orijinal degerin
   degismesini de temin edebiliriz
     */

    /*
    pass by reference
    1-pass by reference da methoda reference yollanir
    2-reference adres demektir. adres yolaninca method adresi kullanarak orijinal degere ulasir
    ve orijinal degeri degistirir.
    bu yuzden c# gibi pass by reference kullanan yazilim dillerinde method
    variable nin orijinal  degerini degistirir,

     */

    public static void main(String[] args) {

        int shirtPrice = 200;

        System.out.println(discount("student",shirtPrice));//bu sekilde sadece bu koda ozel olarak fiyat degisir bu isleme pass by value denir

        System.out.println(shirtPrice);

        shirtPrice =discount("veteran",shirtPrice);//bu sekilde orjinal deger degisir bu isleme PassbyReference denir
        System.out.println(shirtPrice);



    }


    //Discount Method'u olusturunuz
    public static int discount(String type,int price) {
        switch (type){

            case "student":
                price =price-20;
                break;

            case "veteran":
                price =price -40;

                break;


            case "senior":
                price =price -30;

                break;

            default:
                price =price;

        }
        return price;

    }

}
