package day26overriding;

public class AnimalRunner {

    /*
      1)Parent Class'da ki method'u Child Class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.
      2)Overriding'de method'un parantezine,method'un ismine dokunulmaz, method'un body'si degistirilir.
      3)@Override ==> Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar.
      4)Overriding'de Parent Class'daki method'a "Overridden Method" denir, Child Class'daki method'a ise "Overriding Method" denir.
      5)"private" method'lar "override" edilemezler.
      6)Child Class'daki override edilmis method(Overriding Method)'un access modifier'i Parent Class'daki override
      edilmis method(Overridden Method)'un access modifier'indan dar olamaz.
      Overridden Method ==> protected ise Overriding Method ==> protected + public
      Overridden Method ==> default ise Overriding Method ==> default + protected + public
      Overridden Method ==> private ise Overriding Method ==> override olmaz ki access modifier'i olsun. Look 5th.
     7 child classda override edilen methodun  return type methodun return ettigi


     */

    public static void main(String[] args) {


        Cat myCat=new Cat();
myCat.eat();
myCat.drink();
    }
}
