package GrupCalismalari;

import java.util.Scanner;

public class Day2_Calisma4 {
    public static void main(String[] args) {
        // kullanıcıdan sureklı bir sayi alalım
        // sayıları toplayalım X bastıgında bitir.
        int girilenSayi =0;
        int toplam =0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Lutfen sayilarini giriniz : " +
                    "\nBitirmek icin 0'a basiniz");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;
        }
        while (girilenSayi!=0); // girilen sayi 0 a eşit olmadigi surece do blogunu calistir.
        System.out.println("sayilari toplami : " + toplam);
    }
}
