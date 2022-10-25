package GrupCalismalari;

import java.util.Scanner;

public class Day2_Calisma1 {
    public static void main(String[] args) {
        // kullanıcıdan sureklı bir sayi alalım
        // sayıları toplayalım X bastıgında bitir.
        int girilenSayi = 0;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Lutfen bir sayi giriniz :" +
                    "\nLutfen bitirmek istiyorsanız 0'e basınız");
            girilenSayi = scan.nextInt();
            if (girilenSayi == 0) {
                break;
            } else {
                toplam += girilenSayi;
                i = -1;
            }
        }
        System.out.println("Toplam sayilar : " + toplam);
    }
}
