package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {

    /*
    java nested if leri calistirirken cok zamana ihtiyac duyar.
    bu yuzden biz mumkun oldugu kadar bunu kullanmayiz.son tercih!!!
    iyi kod kisa koddur.....
     */

    public static void main(String[] args) {

        /*
         Example 1: Kullanicidan 3 tane pozitif bir tamsayi aliniz.
          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
          Eger ucgen ise "eskenar"
          Ucgen olma durumunu
          kontrol ediniz.
          INFO :
          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                           herhangi iki kenar farki ucuncu kenardan kucuk olmali
           a+b>c>a-b
           a+c>b>a-c
           b+c>a>b-c
           a=b=c ise eskenar ucgen
         */


      /*
        Scanner input = new Scanner(System.in);

        //kullanici yanlislikla sayi girdi ise kod asagidaki gibi yazilir.
       // double sideLength1 = input.nextDouble();
       // double sideLength2 = input.nextDouble();
       // double sideLength3 = input.nextDouble();
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        //kullanicinin negatif sayi girmesini istemiyorsaniz!!!!
        if ( a<0 || b<0 || c<0){
            System.out.println("ucgenin kenarlari negatif olmaz");
        }

        if ((a+b>c && c>Math.abs(a-b))  ||(a+c>b && b>Math.abs(a-c)) || (b+c>a && a>Math.abs(b-c)){
            System.out.println("sen ucgensin");
        }else{
            System.out.println("sen ucgen degilsin..");
*/




        /*
          Example 1: Kullanicidan 3 tane sayi aliniz.
                     Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                     Eger ucgen ise “eskenar”
                     Ucgen olma durumunu
                     kontrol ediniz.
                     INFO :
                     Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                       herhangi iki kenar farki ucuncu kenardan kucuk olmali
                     a+b>c>a-b
                     a+c>b>a-c
                     b+c>a>b-c
                     a=b=c ise eskenar ucgen
         */
                    Scanner input = new Scanner(System.in);
                    System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");

                    //Kullanici yanlislikla negatif sayi girdi ise kod asagidaki gibi yazilabilir.
        //        double a = Math.abs(input.nextDouble());
//        double b = Math.abs(input.nextDouble());
//        double c = Math.abs(input.nextDouble());

                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double c = input.nextDouble();

                    //Kullanicinin negatif sayi girmesini affetmiyorum
                    if(a<0 || b<0 || c<0){

                        System.out.println("Ucgenin kenarlari negatif olamaz");

                    }else if((a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c))){


                        if(a == b && b == c){
                            System.out.println("Ucgen hem de eskenar ucgen...");
                        }else{
                            System.out.println("Ucgen ama eskenar degil...");
                        }

                    }else{
                        System.out.println("Sen ucgen degilsin...");
                    }



                }

    }


    /*
        Java "Nested If" leri calistirirken cok zamana ihtiyac duyar.(Time Consuming)
        Bu yuzden, biz mumkun oldugu kadar "Nested If" kullanmamaya calisiriz.
     */

     /*
     Example 1: Kullanicidan 3 tane sayi aliniz. Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
             Eger ucgen ise “eskenar”
             //Ucgen olma durumunu
             //kontrol ediniz.
             //INFO :
             //Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
             //                herhangi iki kenar farki ucuncu kenardan kucuk olmali
             a+b>c>a-b
             a+c>b>a-c
             b+c>a>b-c
             a=b=c ise eskenar ucgen
             */






        //Scanner input = new Scanner(System.in);
       // System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");

        //Kullanici yanlislikla negatif sayi girdi ise kod asagidaki gibi yazilabilir.
//        double a = Math.abs(input.nextDouble());
//        double b = Math.abs(input.nextDouble());
//        double c = Math.abs(input.nextDouble());

        //double a = input.nextDouble();
        //double b = input.nextDouble();
        //double c = input.nextDouble();
       // boolean ucgenmi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));

        //Kullanicinin negatif sayi girmesini affetmiyorum
       // if(a<=0 || b<=0 || c<=0){

            //System.out.println("Ucgenin kenarlari negatif olamaz");

        //}else if(ucgenmi){

           // if(a==b && b==c && a==c){
             //   System.out.println("Ucgen hem de eskenar ucgen...");
           // }else{
            //    System.out.println("Ucgen ama eskenar degil...");
           // }

       // }else{
        //    System.out.println("Sen ucgen degilsin...");
      //  }

