package nighttime09;

import java.util.*;

public class CollectionsMethods {

    // Kullanıcıdan 5 sayıdan olusan
// bir liste isteyin.
// listeyi sirala ve tersten yazdir//sort tersden diyorsa reverseOrder
// listeyi karıştırin ve yazdırin//shuffle
// 3'er sağa kaydirin ve yazdırin//rotate


    public static void main(String[] args) {

        ArrayList<Integer>arrList= new ArrayList<>();

        Scanner input=new Scanner(System.in);

        for (int i=0; i<5; i++){

            System.out.println("Lutfen sayi giriniz");
        }

//package practice.practice_nighttime.nighttime09;

//import java.util.*;

        ////public class Socrative01 {

           // public static void main(String[] args) {


//1)
                Queue<Integer> queue = new LinkedList<>();

                queue.add(3);
                queue.add(5);
                queue.add(7);
                queue.add(9);
                queue.add(11);
                queue.add(13);

                int count = 0;
                while (queue.isEmpty() == false) {

                    queue.remove();

                    count++;

                    if(count == 3) {
                        break;
                    }
                }
                System.out.println(queue);
//6)
                Queue<String> q = new PriorityQueue<>();

                q.add("Teddy");
                q.add("Mark");
                q.add("Leo");
                q.remove();

                //7)
                HashSet<String> hSet = new HashSet<>();

                hSet.add("Z");

                hSet.add("Y");

                hSet.add("A");

                hSet.add("T");
                hSet.add("X");

                System.out.println(hSet);//A

                TreeSet<String> tSet = new TreeSet<>(hSet);

                System.out.println(tSet);//B



            }//main
        }//class






