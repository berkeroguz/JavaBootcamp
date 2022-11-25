package GrupCalismalari;

import java.util.Scanner;

public class DonguKarsilastirma {
    //Girilen sayının faktöriyelini yazdıran program.
    //Örnek = 3 >>> 3*2*1 = 6

    public static void main(String[] args) {
        /*
            İstenilenler:
            input1 = kullanıcıdan sayı al.  1 Tane sayı istiyorum döngüye gerek yok.
            işlem = kullanıcıdan alınan sayı ile işlem yapılacak.
            çıkış = işlemden gelen sonucu çıkış edecek.  = 6 Döngüye gerke varmı ? Yok.

            Adım 1 : Başla
            Adım 2 : faktoriyelSonuc=1
            Adım 3 : Sayac = 0;
            Adım 4 : input= ,Output " Lütfen bir sayı giriniz "
            Adım 5 :
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int input = scan.nextInt();
        int faktoriyelSonuc=1;
        boolean durum = true;

        do {
            if (input<1)
            {
                durum = false;
            }
            else {
                faktoriyelSonuc=faktoriyelSonuc*input;
                input--;
            }
        }
        while(durum);
        System.out.println("sonuc = " +faktoriyelSonuc);




        /*
       Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int input = scan.nextInt();
        int faktoriyelSonuc=1;
        boolean durum = true;
        while(durum)
        {
            if (input<1)
            {
                durum = false;
            }
            else {
                faktoriyelSonuc=faktoriyelSonuc*input;
                input--;
            }
        }
        System.out.println("faktoriyelSonuc = " + faktoriyelSonuc);
/*
        for (int i=input  ;  i>0  ;i--)
        {
            faktoriyelSonuc=faktoriyelSonuc*i;
        }
        System.out.println("faktoriyelSonuc = " + faktoriyelSonuc);

        */



    }
}
