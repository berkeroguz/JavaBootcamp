package GrupCalismalari;

import java.util.Scanner;

public class Day4_Calisma1 {
    public static void main(String[] args) {
        //For loop
        //Sayıların toplamını yazdıran for döngüsünü kurun.

        /*
        int sonuc=0;
        for (int i=0 ;i<10;i++) //0-9
        {
            sonuc = sonuc + i;
            System.out.println(i);
        }
        System.out.println("0-9 arasındaki sayıların toplamı = " + sonuc);

         */

        //Girilen sayının rakamlar toplamı'nı yazdıralım.

        //Modulus kullanacağız. % 1234567 %10
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        long sayi = scan.nextLong();
        String strSayi=""+sayi;
        int birlerBasamagi;
        int toplam=0;
        for (int i=0;i<strSayi.length();i++)
        {
            birlerBasamagi = (int) (sayi % 10);
            toplam=toplam+birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println("Girilen sayının rakamlar toplamı = " + toplam);





    }
}
