package ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {

        String str ="Java candir";

        System.out.println(str.replace('a', 'A')); // JAvA cAndir

        System.out.println(str.replace(' ', '_')); //Java_candir

        System.out.println(str.replace("candir", "çok güzeldir.")); // Java çok güzeldir.

        System.out.println(str.replace(" ", "")); //Javacandir

        System.out.println(str.replace("a", "")); // Jv cndir

        System.out.println(str.replace("Java", "Java".replace("candir", "cok guzel"))); //Hava cok guzel

        System.out.println(str.replace("", "_"));

        //sadece 1.a'yi A yapin

        System.out.println(str.replaceFirst("a", "A"));




    }
}
