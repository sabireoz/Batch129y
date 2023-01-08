package day25inheritance;

public class Vehicle {


    /*
Child Classdan bir object olusturdugumuzda Constructorlar en ustteki parent clasdan
baslatilarak alta dogru calistirilirlar.
2)Child Classdaki constructorlardan Parent Classdakiconstoructora gidebilmek icin super() kullanilir
3)Parent Classda birden fazla constructor varsa istenilen constoructor super ()ifadesinin pararntezi icine yazilan parametreler yardimiyla secilebilir.
4)Ayni class icindeki constructorlari secmek icin this() kullanilir.
Ayni classda birden fazla constructor varsa istenilen constructor tis () ifadesinin parantezi icine yazilan parametreler yardimiyla secilebilir.
5)super() ifadesinj yazmak istege baglidir,yazmasanizda Java sankisuper() varmis gibi davranir.
Ama kodunuz daha rahat okunmasi icin yazmasi tavsiye edilir.
6)super constroctur icinde her zaman ilk satirda olamlidir.ayni kural this icinde gecerlidir.
ayni anda ikisini kullanamyiz..
8)inherinceda variable cagirmak icin this veye super kullanilair ..
this ayni class icindeki variablari ve methodlari cagirmak icin kullanilir
super parent class icindeki variablari ve methodlari cagirmka icin kullanilir;
     */

 public int price= 120000;
 public void engine(){
     System.out.println("Honda engine ..");
 }
    public Vehicle() {
        System.out.println("Vehicle 1");
    }

public  Vehicle(int price){
    System.out.println("Vehicle2:"+ price);
}
}
