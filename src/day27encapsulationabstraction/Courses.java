package day27encapsulationabstraction;

public abstract class Courses {
/*

1.bazen metod bodysini yazmak gerekmez , bu durumlarda bodysiz mteot olusturmak gereekir.
Body si olmayan metodlara Abstrac methodlar denir..
2.Abstrac metodlar child metodlar tarafindan override edilmek zorundadirlar.
Bu yuzden eger bir fonlsiyonun child classlar tarfindan mecbur kilmak isterseniz o methodu abstrac yapmak gerekir.
3.Bir methodun bodysini silmek o methodun abstarack olmasi icin yetrerli degildir.
"accses modifier "ile "return type "arasina abstrac keyword koymak gereki
4.abstrac metodlar siradan classlarin(concret) icine yazilamazlar abstrac method larin icine yazildiklari classlar abstract olmak zorundadir.
5.Abstrac claslarda hem abstrac methodlar hem de concrete methodlar kullanilabilir.
6.concret classlar abstrac classlarin childi olabilirler..
abstrac method larin overidin

 /*
   1)Bazen method body'sini yazmak gerekmez. bu durumlarda body'siz method oluşturmak gerekir.
     Body'si olmayan method'lara "abstract methodlar" denir.

   2)"abstract methodlar" child class'lar tarafından "override" edilmek zorundadirlar
       Bu yüzden, eğer bir fonksiyonun child class'lar tarafından kullanılmasını mecbur kılmak isterseniz
      o methodu abtract yapmak gerekir

   3)Bir methodun body'sini silmek o methodun abstract olması için yeterli değildir.
     "Access modifier" ile return type arasına "abstract" keyword koymak gerekir.

   4)"abstract method"lar sıradan class'ların içine yazılamazlar, "abstract method"ların içine yazıldıkları class'larda
     abstract olmak zorundadirlar.

   5)"abstract class"larda hem "abstract method"lar hemde "concrete method"lar kullanılabilir
   6)"concrete class"lar "abstract class"ların child'ı olabilirler.
     "abstract method"ların override edilme zorunluluğu concrete class'lar içindir.

*/


 public abstract void math();

 public  void  art(){
     System.out.println("Painting...");
 }
}
