package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Kullanıcıdan ismini alıp büyük harflerle yazdırın.


        //1.adim : scan objesi olusturma
        Scanner scan = new Scanner(System.in);

        //2.adim kullani
        System.out.println("Lütfen isminizi girin.");

        String kullaniciAdi=scan.next();

        System.out.println("Sizin Adınız = " + kullaniciAdi.toUpperCase());




    }
}
