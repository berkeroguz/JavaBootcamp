package ders10_stringManipulation;

import java.sql.SQLOutput;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";
        System.out.println(str.indexOf("a")); // 9 .  ilk a'nin index'ini döndürür.
        System.out.println(str.indexOf('c')); //8 ilk c..

        System.out.println(str.indexOf("hersey")); //hersey'in basladıgı indeks numarasını döndürü. /15

        System.out.println(str.indexOf("e",9)); //9'dan itibaren ilk e 'yi bulur.

        // 13. index'deki e 'den bir sonraki e'nin index'ini bulalım.

        System.out.println(str.indexOf("e",14));

        //cümledeki 2.c 'nin index'ini

        int ilkcindex = str.indexOf("c");

        System.out.println(str.indexOf("c",ilkcindex+1));

        System.out.println(str.indexOf("ali"));

    }
}
