package day30exceptionsinterface;

public class Exceptions01 {
/*

1)Exceptions olsada olmasada calistirmamiz gereken kodlari "finally block "icine yazariz
2)Database ile baglantiyi kesme isini kodlar gibi kodlar her halukarda calistirilmalidir,bu tarz kodlari finaly block icine koyariz.
3)try block yalniz kullanilamaz .
try block+ 1 catch blok  ==>mumkundur
try block+ 1 catch blok+ 1 finally blok  ==>mumkundur
try block+ coklu catch blok  ==>mumkundur
try block+ coklu catch blok+1 finaly  ==>mumkundur
try block+ finally blok  ==>mumkundur
4)coklu finally block kullanilamaz.

 */

    public static void main(String[] args) {



int a=12;
int b=3;

int c[]={3,6,9,12};
m(c,a,b);
    }

 public  static void  m(int[]c,int a,int b){
        try {//try tek basina kullanilamaz catch koyarsak yapmayi dene demektir yapamazsan cozumler uretiriz.
            int idx=a-b;
            int element =c[idx];
            System.out.println(element);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {//yada direk trydan sonra kullanarak yapamazsan kapat gitsin diyebiliriz.
            System.out.println("cut the connection with the DB");
        }

 }//Index 9 out of bounds for length 4
   // cut the connection with the DB


}
