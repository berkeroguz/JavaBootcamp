package ders04_matematikselIslemler_incrementDecrement;

import java.util.Scanner;

public class C03_dataCasting {
    public static void main(String[] args) {

        // Kullanıcıdan iki integer değer alıp
        // bunları birbirine bölün
        // sonucu da double olarak yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 sayı giriniz.");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        double sonuc = (double)(sayi1/sayi2); // 3 yazar double 3.0 yapar

        System.out.println(sonuc);

        double dogruSonuc= (double)sayi1 /sayi2; // geniş olana göre atar ve 3.666

        System.out.println(dogruSonuc); // 3.3333333333333335


    }
}
