package Introduction.day12switchincrementdecrementloops;

public class IncrementDecrement {

    public static void main(String[] args) {
        /*

Increment - Artırmak

      int age = 12;

    1) age = age +1;
               [ 1). ve 2). yol istenildiği kadar artılabilir ancak; ]
    2) age+=1;
    3) age++;    [  3). yol ile sadece '+1' bir artırmak için kullanılır. ]

    Bu yazılan kodların hepsi 1 artırır  yani age değerimizi bu 3 kod ile 13 yapar


Increment - Carpma

         int salary = 120000;

     1) salary = salary*1.1;

     2) salary*=1.1;

Decrement - Azaltmak

        int prince = 12;

    1) price = price-3;  (sonucu 9 yapar)

    2) price-=3;  (kısa olan yolu budur)

    3) price--;   (bu yol ile sadece 1 azaltır)

 - Bölme

       int salary = 1200;

    salary = salary/3;

    salary/=3; (kısa olan yolu budur ve bölmede (++ --) gibi yöntemi yoktur)



 */
        int age =12;
        System.out.println(age);//12

        age = age++; //post increment
        System.out.println(age);


        age = ++age; //pre increment

        System.out.println(age);

        int salary = 40;
        salary=salary--;//Post Decrement
        System.out.println(salary);

        salary= --salary;//pre decrement
        System.out.println(salary);


    }


}
