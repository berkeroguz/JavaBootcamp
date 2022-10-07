package ders10_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {

        String str = "manti acarken java öğrenilmez";

         // str mantı ile mi başlıyor? True ya da false döndürür.
        System.out.println(str.startsWith("Mantı"));

        System.out.println(str.startsWith("m")); //m ile mi başlar?

        System.out.println(str.startsWith("manti acarken java öğrenilmez")); //true
        System.out.println(str.startsWith("")); // m'den önce hiçbir şey yok

        System.out.println(str.startsWith("acarken", 6)); // 6. indeksten sonra "acarken" ile mi baslıyor? True.

        System.out.println(str.startsWith("manti", 0)); // 0. indeksten itibaren manti ile mi balsıyor? True

        System.out.println(str.startsWith("java",10)); // false


    }
}
