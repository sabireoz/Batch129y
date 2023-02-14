package lambdaburakhoca;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01{



        public static void main(String[] args) {


            List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

            ciftVePozitifLamExYazdir(sayi);
            System.out.println(" \n  *******");
            ciftVePozitifMetRef(sayi);
            System.out.println(" \n  *******");
            kareYazdir(sayi);
            System.out.println(" \n  *******");
            kareTekrarsiz(sayi);
            System.out.println(" \n  *******");
            buyKucSirala(sayi);
            System.out.println(" \n  *******");
            pozitifKupBirlerBas5(sayi);
            System.out.println(" \n  *******");
            topMetRefBul(sayi);
            System.out.println(" \n  *******");
            toplamLambdaEx(sayi);
            System.out.println(" \n  *******");
            ciftElKareKucBuySirListReturn(sayi);

        }

        //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

        public static void ciftVePozitifLamExYazdir(List<Integer> sayi) {

            sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(t -> System.out.print(t + " "));

        }


        //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

        public static void ciftVePozitifMetRef(List<Integer> sayi) {

            sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(Utils::yazdir);

        }

        //  soru3;list elemnlarinin  karelerini aralarinda bosluk olacak sekilde yazdirin.
        public static void kareYazdir(List<Integer> sayi){
            sayi.stream().map(Utils::ciftBul).forEach(Utils::yazdir);

        }

//Soru4;;List elemanlarinin karelerini tekrarsiz yazdirin

        public static void kareTekrarsiz(List<Integer> sayi) {
            sayi.stream().distinct().map(Utils::ciftBul);

        }

        //Soru5: List elemanlarinin buyukten kucuge siralayarak yazdirin.//sorted metodu kucukten buyuge siralar
        public  static void buyKucSirala(List<Integer>sayi){

            sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);//BUYUKTEN KUCUGE SIRALAR


        }
        //soru6:List elemanlarinin pozitif olanlarinin//FILTR ,kuplerini bulup(MAP), birler basmagi 5(FILTEER) olanlari yazdirinz.,

    public static void pozitifKupBirlerBas5 (List<Integer>sayi){

            sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::yazdir);
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın//reduce tek elemna olarak cikiyorsa

    public static void topMetRefBul(List<Integer>sayi){

      Optional<Integer> sonuc= sayi.stream().reduce(Integer::sum);//reduce metodu terminal metodu dur bundan sonra methpod kull
        // aniilmaz.bu yuzden sonucu souut ile yazdiririz .findFirst forEach de termianl metoddr




        System.out.println(sonuc);
    }

//soru8:List elemanlarini Lambda Expression ile toplamini bulun ve yazdirin.

    public static void toplamLambdaEx(List<Integer>sayi){

            int sonuc =sayi.stream().reduce(0,(a,b)->a+b);

        System.out.println(sonuc);
    }


//soru9:Listin pozitifelemanlarinin carpimini Lambda Expression ile return ederek yazdirin;

    public static int pozitifElCarpimiLamEx(List<Integer>sayi){

      int sonuc =  sayi.stream().filter(t->t>0).reduce(1, (a,b)->a*b);
        return sonuc;
    }
//soru10;Listin cift elemanlarinin karelerini kucukten buyuge siralayip list halinde return ederek yazdiriniz.

    public static List ciftElKareKucBuySirListReturn(List<Integer>sayi){//void i list yaptik
    List<Integer>sonuc=  sayi.stream().filter(t->t%2==0).map(t-> t*t).sorted().collect(Collectors.toList());
      return sonuc;
    }
    }



