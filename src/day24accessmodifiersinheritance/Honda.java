package day24accessmodifiersinheritance;

public class Honda extends Car{



        public Honda(){
            this("R8",2023);
            System.out.println("Honda 1");
        }
public  Honda (String model,int year){
    System.out.println("Honda 2:"+ model+ "-"+year);
}
    }


