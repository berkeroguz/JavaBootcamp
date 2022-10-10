package ders11_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str ="J1ava2 G9uzel5dir8";

        //str'daki sayilari silip metni Java Guzeldir seklinde yazdırınız.

        //str.replaceAll() sadece bir harf veya char sequence'i değil
        // genelleme ile soyleyebilecegimiz ortak özellikteki tm karakterleri degistirir.

        System.out.println(str.replaceAll("\\d", "")); //Java güzeldir

        System.out.println(str.replaceAll("\\D", "")); //12958

        String s1="ilk urun fiyati : 1250 tl";
        String s2="ikinci ürün fiyatı : 1500 tl";

        //iki ürünün fiyatını toplayın.



    }
}
