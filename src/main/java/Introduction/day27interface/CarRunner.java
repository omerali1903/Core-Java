package Introduction.day27interface;

public class CarRunner {

    public static void main(String[] args) {

        Engine.stop();//stop() method'u static oldugundan "interface" ismi ile  ulasabiliriz.

        Honda h = new Honda();
        h.eco();//eco() method'u static olmadigindan  "object" ismi ile ulasabiliriz.
    }

}
