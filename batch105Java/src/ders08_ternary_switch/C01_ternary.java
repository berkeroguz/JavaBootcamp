package ders08_ternary_switch;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayı alın
        // Sayı pozitif ise 2 katını
        // negatif ise sayiya 10 ekleyip yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Sayı giriniz.");
        double sayi = scan.nextInt();

        System.out.println(sayi>0 ? 2*sayi : sayi+10);





    }
}
