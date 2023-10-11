package Introduction.day25polymorphism;

public class Cat extends Animal{


    @Override
    public void move() {
        System.out.println("Cats move...");
    }


    @Override
    protected int add(int a, int b) {
       return a+b+1;
    }

    @Override
    public Animal create() {
        return new Cat();
    }


    @Override
    public Integer multiply(Integer a, Integer b) {
        return 2*a*b;
    }


}
