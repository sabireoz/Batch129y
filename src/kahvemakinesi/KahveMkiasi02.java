




package kahvemakinesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KahveMkiasi02 {

    public static void main(String[] args) {

        System.out.println("HOSGELDINIZ...");

        List<String> kahveList = new ArrayList<>();
        kahveList.add("Turk Kahvesi");
        kahveList.add("Espresso ");
        kahveList.add("Latte");
        // List hangikahve;
        Scanner input = new Scanner(System.in);

        String hangikahve;
        do {

          //  hangikahve = input.nextLine();
          //  hangikahve = input.nextLine().equalsIgnoreCase();
            System.out.println("Hangi kahveyi icmek istersiniz?");
            System.out.println("1.Turk kahvesi 2.Espresso 3.Latte");
            if (hangikahve.equals("turk kahvesi") || hangikahve.equals("Espresso") || hangikahve.equals("Latte")) {
                break;

            } else {
                System.out.println("Hatali Giris Yaptiniz...");
            }
        } while (true);

        String kahveTuru = hangikahve.toUpperCase() + hangikahve.equals(1);
        System.out.println(kahveTuru + "hazirlaniyor");
        System.out.println("sut eklememizi ister misinz? Lutfen evet yada hayir olarak cevaplayiniz");
        String sut = input.next();
        if (sut.equals("evet")) {
            System.out.println("sut ekleniyor...");
        } else if (sut.equalsIgnoreCase("hayir")) {
            System.out.println("sut eklenmiyor");
        }

        System.out.println("Seker ister misiniz? Evet yada hayir olarak belirtiniz");
        String seker = input.next();
        if (seker.equalsIgnoreCase("evet")) {
            System.out.println("Kac seker olsun?..");
            int kacSeker = input.nextInt();
            System.out.println("seker ekleniyor");
        } else if (seker.equalsIgnoreCase("hayir")) {
            System.out.println(" kahvenize seker eklenmiyor");
        }
        String boyut = input.nextLine();
        System.out.println("Kahve boyutunu secer misinz...Buyuk- orta-kucuk");
        if (boyut.equalsIgnoreCase("buyuk boy") || boyut.equalsIgnoreCase("orta boy") || boyut.equalsIgnoreCase("kucuk boy")) {
            System.out.println("kahveniz" + boyut + "olarak hazirlanmistir ");
            System.out.println("Afiyet olsun");
        }

    }






}
