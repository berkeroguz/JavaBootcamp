package ders04_matematikselIslemler_incrementDecrement;

import java.util.Scanner;

public class C02_dataCasting {
    public static void main(String[] args) {

        /*
         Kullanıcıdan iki double sayı alın. İlk sayiyi ikinci sayiya böl
         bölüm işleminin sonucununun tam sayı kısmını yazdırın.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen İki Sayı giriniz.");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        int sonuc = (int)(sayi1/sayi2);
        System.out.println(sonuc);


    }
}
