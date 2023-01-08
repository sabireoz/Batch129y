package day26overriding;

public class Cat extends Mammal {

    public void meow() {
        System.out.println("Cats meow...");

    }

    @Override //override Annotation:Jva bu isareti gorunce kontrol eder kurallara uygun mu diye
    public void eat() {//Child daki override edilmis eat () metoduna overrinding method denir

        System.out.println("Cats eat...");

    }

    @Override

    public void drink() {
        System.out.println("Cats drink..");
    }

    @Override
    public Animal create() {
        return new Cat().create();
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }


    public int multyplay(int a, int b) {
        return a * b;

    }
}