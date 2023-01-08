package day26overriding;

public class Animal {
/*
1)Parent classdaki methodu Child class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.
2)Overriding de methodun parantezine, methodun ismine dokunulmaz methodun bodysi degistirilir
3)@Overriding ==>Overriding Annotion override kurallarinin Java tarafindan kontrol edilmesini saglar.
4)Overrideng de parent clasdaki meyhoda "Overridden method ,child clasdaki metoda overriding method denir.
5)"Private methodlar Ovrrid edilemezler
6)child classdaki ovrriding methodun Accses modifier Parent classdaki (overriden method)daha dar olamaz
Overriden ==protected ise aynisi yada daha genis==protectec+public
overriden Method==>default ise Overriding Method ==> default +protected+public
overriden Method==>private ise Overriding Method==> override olmaz ki access modifier i olsun
7)Child Classda override edilen methodun (Overriding method) return type methodun return ettigi data typenin aynisi veya
ve o data typenin parente olarak secilebilir.
8)Method un return type i primitiv ise Overriding yaparken return type degistirilemez .Cunku return type ya ayni olur veya parentttan secilir
ama primitive ler arasinda parent child iliskisi olmadigindan parentdan secmek mevzu bahis olamaz o zaman tek scenek aynisi olmalidir kalir
9)Method un return type Wrapper class ise Overriding yaparken return type degistirilemez.cunku return type ya ayni olur veya parenttan secilir
ama Java bir wrapper classi digerinin parenti yapmadigindan parentttan secme ihtimali yoktur.
10)methodun return type void se overriding yaparken return type degistirilemez..
11)Final kelimesini variable larda kullanabilirsiniz.
--->Final variable ise ;
i)mutlaka deger atanmalidir.
ii)ilk atanan deger degistirilemez.

12)Final kelimesini Methodlarda kullanabilirsiniz.
--->Final method ise ;
i)methodun bodysi degistirilemez
ii)method bodysi degistirilemeyince override yapmak mumkun olmaz..
13)Final kelimesini Class larda kullanabilirsiniz.
--->Final Class ise ;
i) O classin childi olmaz.
14)Final methodlar ve static metodlar override edilemezler..
15)Override yapabilmek icin Inheritance sarttir.Baska bir ifadeyle Parent-Child iliskisi sarttir.
16)Method Overloading "Compile Time Polymorphism"dir.Method Overriding "Run Time polymorphism dir".
17)Method Overloading "Statik Polymorphism"dir.Method Overriding "Dynamic polymorphism dir".


 */

    public void eat(){
        System.out.println("Animals eat,,");//parenttaki override edilmis eat () methoduna "Overriden method "denir.


    }

    public void drink(){
        System.out.println("Animals drink,,");
    }

    public Animal create(){
        return new Animal();
    }

    public int add(int a,int b){
        return a+b;
    }

    public  int multyplay(int a,int b){
        return a*b;


    }
}
