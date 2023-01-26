package day28exceptions;

public class Exceptions04 {
    public static void main(String[] args) {

        String arr[] = {"A", "G", "M", "L"};

        getElementFromArray(arr, 1);
        getElementFromArray(arr, 5);
        System.out.println("Hi!");
    }

    //Arraylerde olmayan index kullanildiginda Java ArrayIndexOutOfBoundException atar.
    public static void getElementFromArray(String[] s, int idx) {
        String el = s[idx];
        System.out.println(el);
        try {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }


    }
}