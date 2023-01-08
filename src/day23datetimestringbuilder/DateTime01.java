package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {


        //Example:Time i formatlayiniz.
        LocalTime myTime=LocalTime.now();
        System.out.println(myTime);//20:39:00.080715400
//hh==> 12 lik saat sistemini kullanir...HH==> 24 luk saat sistemini kullanir.
        //hh kullandiginzda am vya pm demelisiniz..yani ""hh:mm a ""yazariz
        //hh:mm:ss(second )
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh-mm a");
        System.out.println(dtf.format(myTime));//08-42//08-44 pm//a yazarsak 12 li sistemde ve pm ve am yazar,,,


    }

}
