package practice08;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HacimRunner {

    public static void main(String[] args) {

        KarePrizma karePrizma=new KarePrizma();
        double karePrizmaHacmi=karePrizma.hacimHesapla(5, 6);
        System.out.println("karePrizmaHacmi="+karePrizmaHacmi);


        NumberFormat obj=new DecimalFormat(".00");//Virgullu kisimi almak istemedigimizde

//virgulden sonra iki basamak yazdirir.
        Koni koni=new Koni();
        double koniHacmi=koni.hacimHesapla(3, 5);
        System.out.println(koniHacmi);//47.0999999
        System.out.println("koniHacmi = " + obj.format(koniHacmi));//47.10


                Silindir silindir = new Silindir();
        double silindirHacmi=silindir.hacimHesapla(1,5);
        System.out.println("silindirHacmi = " +obj.format(silindirHacmi));//silindirHacmi = 15.70


    }


}
