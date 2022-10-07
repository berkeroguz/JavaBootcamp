package ders10_stringManipulation;

public class C10_isEmpty {
    public static void main(String[] args) {

        String str="";
        boolean bosMu=str.isEmpty(); // true döner
        System.out.println(bosMu);

        str="    ";

        System.out.println(str.isEmpty()); //false

        System.out.println(str.isBlank()); // boşluğu yok sayar.

        str="x";
        System.out.println(str.isEmpty()); //false Empty boşlukları kabul etmez. Boşluk var içinde der. karakter olarak görür.

        System.out.println(str.isBlank()); //false Blank space'leri kabul eder.


    }
}
