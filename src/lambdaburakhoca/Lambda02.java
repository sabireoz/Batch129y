package lambdaburakhoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {

    public static void main(String[] args) {

        List<String>meyve=new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt",
                "nar","mandalina","armut","elma","keciboynuzu","elma"));

        elemanBasinaVeSonunaYildiz(meyve);
        karakterSayGoreBuyKucSirKarSayEnBuyIlk3(meyve);
    }

    //soru1:List elemanlarinin ilk harfi e veya c olanlari Method REferance ile aralarinda bosluk birakarak yazdiralim

    public static void ilkHarfeVeyac(List<String>meyve){


        meyve.stream().filter(t->t.startsWith("e")||t.startsWith("c")).forEach(Utils::yazdir);
    }
//SORU2;List elemanlarinin hepsinin basina ve sonuna * ekleyelim yazdiralim
    public static void elemanBasinaVeSonunaYildiz(List<String>meyve){

        meyve.stream().map(t->"*"+ t+"*").forEach(Utils::yazdir);

    }
    //soru3:List elemanlarini  karakter sayisina gore buyukten kucuge siralayiniz
    // karakter sayisi en buyuk ilk 3 elemani list halinde returnnedrek yazdrin

    public static List<String> karakterSayGoreBuyKucSirKarSayEnBuyIlk3(List<String>meyve){
      List<String>sonuc=  meyve.stream().
                sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(3).collect(Collectors.toList());
        return sonuc;
    }



}
