package day24accessmodifiersinheritance;

public class Animal {

    /*
     Inheritance'in faydalari;
    1) Code standardinda tekrar iyi degildir.
    2) Code degisime acik olmalidir.Hatayi duzeltmek kolay olmali.
    3) Gelisime update'e acik olmalidir
    4) Code atomic yapida olmali.
    Note 1: "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
    Note 2: Bir parent class'a bagli child class'i belirtmek icin "extends" keyword kullaniriz
    Note 3: "public" method'lar child class'lar tarafindan kullanilabilir.
            "child class'lar tarafindan kullanilabilir" demek "inherit edilebilir" demektir.
    Note 4: "protected" method'lar "inherit edilebilir".
            Cunku "protected" olan method ve variable'lar child'lar tarafindan kullanilir.
    Note 5: "default" method'lar object ile ayni package'de olduklari surece "inherit" edilebilirler.
            Ama default method ile object'in uretildigi class farkli package'lerde ise "inherit" edilemezler.
            note 6:private methodlar inherit edilemezler..
    Note7;Java birdenn fazla parenti onaylamaz..
    note 8;javada objevt class tum java classlarinin ortak parentidir.
    note9:child==>parent==>grand parent==>grand grand parent...seklinde ilerleyen inheritancelara multi level inheritance denir.
    note 10:Java Object class haric tum classlarin Parente vardir...


     */

    public void eat(){
        System.out.println("Animals eat...");
    }
    void drink(){
        System.out.println("Animals drink...");
    }
}


