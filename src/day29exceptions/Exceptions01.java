package day29exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        Object obj = 70;

        try {
            String str = (String) obj;// Birbirine donusturulemeyecek data typelerini donusturmekde israr ederseniz Java ClassCastException atar.


        } catch (ClassCastException e) {

            System.out.println("her data type her data typene cevrilemez");//hata verir obje buyuk string kucuk oldugu icin non-orimitivlerde calismaz.

        }
    }
}
