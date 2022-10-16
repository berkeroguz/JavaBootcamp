package ders16_doWhileLoop;

import com.sun.source.tree.WhileLoopTree;

public class C02_doWhileLoop {
    public static void main(String[] args) {

        // 10,11,12 sayılarını toplayan while do ödngüsüü

        int sayi=10;
        int toplam=0;

        do {
            toplam=toplam+sayi;
            sayi++;
        }
        while(sayi<13);

        System.out.println(toplam);

        /*
            Do While loop'un 2 avantaji vardir.
            1- Loop Body'si en az bir kere çalışır.
            (While loop'da başlangıç değeri uygun değilse, loop body'si hiç çalışmayabilir)

            2- While bitis kontrolü loop kadar çalışır
            ( While loop'da bir kere fazla çalışabilir )

         */
    }
}
