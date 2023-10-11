package Introduction.day18constructorsstatickeyword;

public class StudentRunner {

    public static void main(String[] args) {

        //Statuc olan "numOfRegisteredStd" variable 'ini cagirmak icin sadece class ismini kullandik,object olusturmadik
        System.out.println(Student.numOfRegisteredStd);

        //static olmayan "num" variable'ini cagirmak icin object olusturduk.
        Student s1 = new Student();
        System.out.println(s1.num);

        //static olan "numOfRegistered"






    }




}
