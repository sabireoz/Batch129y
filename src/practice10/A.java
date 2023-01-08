package practice10;

public class A {

    private boolean x;

    public static void main(String[] args) {
    B b=new B();
    b.m();//Bad
        System.out.println(b.x);//20


      A c=new B();
      c.m();
        System.out.println(c.x);

C d=new C();
d.m();//good
        System.out.println(d.x);


        D child=new D();
        System.out.println(child.x);//20
        System.out.println(child.sayi);//50
        child.m();//bad



    }


    private void m() {
    }


}
