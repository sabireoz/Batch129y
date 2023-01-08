package day27encapsulationabstraction;

public class Student {


        private String stdId="AC123";
private  double gpa=3.99;
private boolean poor=true;
    //Encapsulation yapilmis datayi okuyabilir miyiz?

    public  String getStdId(){

        return  stdId;


        //get methodlar(getter) encapsula edilmis datayi okumamiza yarar.
        //her zaman public olur.
        //get methodlarin return type variablen data type ile ayni olur
       // get methodlarin isimleri get+variable name seklinde olur..
       //parametre kullanmazlar.
        //get methodlarin data type boolean sa variable ismi is ile baslar.

    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;


    }


    //encapsulation yapilmis datalarin degeri degistirilebilir mi?
// set metodlar (setter) encapsule edilmis datalari degerlerini degistirmemize yarar.
    //set metodlar her zaman public olur.
    //set methodlarin return type her zaman void olur.
    //set methodlarin isimleri set+variable name seklinde olur..
    // variable ile aynidata typende  parametreyi  kullanirlar


    public void setGpa(double gpa) {
        this.gpa = gpa;


    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}
/*

package day27encapsulationabstraction;

public class Student {

    private String stdId = "AC123";
    private double gpa = 3.99;
    private boolean poor = true;

                //Encapsulation yapilmis data'yi okuyabilir miyiz?
    //get method'lar(getter) encapsule edilmis(saklanmis) data'yi okumamiza yarar
    //get method'lar(getter) her zaman "public" olur
    //get method'larin(getter) return type'i variable'in data type'i ile ayni olur.
    //get method'larin(getter) isimleri "get + variable name" seklinde olur.
    //get method'larin(getter) isimleri variable boolean ise
    // "is + variable name" seklinde olur.
    //get method'lar(getter) parametre kullanmazlar.
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }

               //Encapsulation yapilmis data'larin degeri degistirilebilir mi?
    //set method'lar(setter) encapsule edilmis data'larin degerlerini degistirmemize yarar.
    //set method'lar(setter) her zaman "public" olur.
    //set method'larin(setter) return type'i her zaman void olur.
    //set method'larin(setter) isimleri "set + variable name" seklinde olur.
    //set method'lar(setter) variable ile ayni data type'inda parametre kullanirlar
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}

 */





