package day25inheritance;




    public  class Honda extends Car {
public  int price =100000;

        public Honda(){
            super("Accord");
            System.out.println("Honda 1");
        }
        public Honda (String model,int year){
            super();
            System.out.println("Honda 2:"+ model +"-"+year);
        }

    }
/*
kod okurken main metoddan baslamaliyiz...
 */