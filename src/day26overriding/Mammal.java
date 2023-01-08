package day26overriding;

public abstract class Mammal {

    public void feedWithMilk(){

        System.out.println("Mammals feed their  babies with milk");
    }

    public abstract void eat();

    public abstract void drink();

    public abstract Animal create();

    public abstract int add(int a, int b);
}
