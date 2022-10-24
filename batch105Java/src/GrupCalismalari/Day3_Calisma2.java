package GrupCalismalari;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Day3_Calisma2 {
    public static void main(String[] args) {
        //Array'i tanımlıyor
        int [] sayilar = new int[5];  // [0,0,0,0,0]  // Burada sınıf mevcudumuz belli, öğrenci girişi bekleniyor diyebiliriz.


        //arrayi direkt değerleriyle oluşturuyor
        int [] sayilar2 = {0,2,3,4,45,5,56}; //burada direkt öğrencileri atadık.
        System.out.println(Arrays.toString(sayilar));

        //Index numaraları 0'dan başlar.
        //Index sayısı , yani array'lerin length'i sonradan değiştirilemez
        //Array'lere yeni bir değer atılamaz.
        // sayilar[5]=9; //Runtime error'ra örnektir. Syntax'ta bir sıkıntı çıkarmamasına rağmen run'da hata verir.
        // System.out.println(Arrays.toString(sayilar));

        for (int i = 0; i<sayilar2.length;i++) // Bu da array'in tüm indeks numaralarını tek tek dolaşır.
        {
            System.out.print(i+ ",");

        }

        System.out.println(" ");
        for (int a : sayilar2) // Array'in tüm elemanlarını tek tek dolaşır.
        {
            System.out.print(a + ", ");
        }

        //Bir integer array'in içerisindeki elementlerin her birini 2 arttır.

        int [] numaralar = {5,5,5,5,5};

        for (int i=0;i<numaralar.length;i++) // Array'deki elemanları dolaşır.
        {
            numaralar[i]=numaralar[i]+2;
            //indeks numaralar[0] = numaralar[0]+2;
        }
        System.out.println(Arrays.toString(numaralar));





    }
}
