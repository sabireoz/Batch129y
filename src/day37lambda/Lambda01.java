package day37lambda;

import lambdaburakhoca.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {


    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);
        System.out.println(getSumOfAllElements(myList));
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getMultiplicationFromThreeToNine1());
        System.out.println(getMultiplicationFromThreeToNine2());
        System.out.println(getFactorial(-5));

    }

    //1)Verilen list'deki tum sayilarin toplamini veren method'u olusturunuz
    public static int getSumOfAllElements(List<Integer> myList){
        return myList.stream().reduce(Math::addExact).get();
    }

    //2)7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy(){
        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }

    //3)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    public static int getMultiplicationFromThreeToNine1(){
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();// rangeClosed() ==> [ ]
    }

    public static int getMultiplicationFromThreeToNine2(){
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();// rangeClosed() ==> [ )
    }

    //4)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x){

        if(x==0){
            return 1;
        }else if(x<0){
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        }else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }

    }

  //  public static int getFactorial2(int x){

//    }




//6 SIZE VERILEN IKI TAM SAYI ARASINDAKI TUM TAM SAYILARIN RAKAMLARI TOPLAMINI VEREN KODU YAZINIZ.

//12 ve 18 ==>13 14 15 16 17==4+5+6+7+8=30
public static int getSumOfDigits(int x){
    int sum = 0;
    while (x!=0){
        sum = sum + x%10;
        x = x/10;
    }
    return sum;
}
//public static int getSumOfDigitBetweenTwoInts(int a,int b) {
   // IntStream.range(a+1, b).map(Utils::getSumOfDigits).sum();
//}
}
