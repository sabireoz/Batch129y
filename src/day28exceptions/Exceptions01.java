package day28exceptions;

public class Exceptions01 {


    /*
    1)Exception demek beklenmedik problem demektir.Seyahatte arabanin bozulmasi gibi..
    2)Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir.mesela benzin bitince yol yardimi
    Application larda da beklenmedik problemler icin cozum yollari uretmeliyiz, bu isleme "Exception Handling" denir.
    3)Exception lar temel olrak  ikiye ayrilir
    i)Compile Time Exception:Siz code yazarken farkedilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir.
    ii)Run Time Exception:Siz code yazrken farkedilmez ama codu calistirdiginizda consolda hata alirsiniz.
    4)Exceptionlar disinda eror diye adlandirdigimiz "Handle "edilemeyen problemler vardir.
    Gercek hayattta soforun olmesi gibi..Handle edilemeyecek durumlar Eror dur..
    Aplicationlarda Memorynin dolmasi "ERRor DUR".
    IKi tur memory var
    i)Stack Memory dolarsa "StackOverFlow Error"alirsiniz
    ii)Heap Memory dolarsa "OutOfMemory Error" alirsinz
    5)Yazdigimmiz code calismadiginda log lara bakariz.log(consoldaki icerikler)
    6)if else kullanirsak olusabilecek her problemi if parantezinin icin eyazmamiz gerekir
    Bu da ciddi bir matemetik bilgisi gerektirir,
      Ama try (catch (ArithmeticException e)) yazarsak butun skntilari cozebilir/





     */
    public static void main(String[] args) {

        int a = 12;
        int b = 0;// 0 ile bolum yapilmaz !!!!!3 olsaydi sonucu 4 olarak gorecektik
        divide(a, b);


    }
//Aritmetic Exception yazdiginiz code da matemetiksel islem icin kullanilabilir bir Exceptiondir.
    public static void divide(int a, int b) {

        try {
            System.out.println(a / b);
            System.out.println("I am here");//catch yazilir burasi calismaz..
        } catch (ArithmeticException e) {//sikinti yoksa burasi calismaz..butun matematiksel probleri yakalamis oluyor..
            System.out.println("Do not divide by zero");// 0 ile bolum olmadigi icin consolede burayi goruruz.

        }
       // System.out.println("You are here");calisir handle dan sonraki her sey calisir aplication donmaz!!!

    }
   // exception Handlin ile if-else kullanilmaz..
    public void divide2(int a,int b){

        if(b==0){//if de sikintiyi bilmek ve icine yazmak zorundayiz..
            System.out.println("Do not divide by zero");

        }else {
            System.out.println(a/b);
        }
    }
}