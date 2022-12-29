package ders_disi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaprekarsConstant {
    // Take any four-digit number
    // Arrange the digits in descending and then in ascending order to get two four-digit numbers
    // subtract the smaller number from the bigger number
    // go back to step 2 and repeat until you find result of 6174

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayı giriniz.");
        //girilen sayısı azalan ve artan olarak 2 tür sayıya çeviren method yazalım
        int sayi=scan.nextInt();
        System.out.println("Buyuk Sayı = " + orderToAscending(sayi));
        System.out.println("Kucuk Sayı = "+ orderToDescending(sayi));

        while(true)
        {
            System.out.println("sa");
            int buyukSayi = orderToAscending(sayi);
            int kucukSayi =orderToDescending(sayi);
            if((buyukSayi-kucukSayi)==6174)
            {
                System.out.println("6174'ü bulduk");
                break;
            }
            else sayi=buyukSayi-kucukSayi;
            System.out.println(sayi);
        }

    }

    public static int orderToAscending(int girilenSayi){
        int sayi1,sayi2,sayi3,sayi4;
        sayi1=girilenSayi%10;
        //basamktan kurtul
        girilenSayi=girilenSayi/10;
        sayi2=girilenSayi%10;
        //basamaktan kurtul
        girilenSayi=girilenSayi/10;
        sayi3=girilenSayi%10;
        girilenSayi=girilenSayi/10;
        sayi4=girilenSayi%10;

        //rakamlari list'e aldık
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(sayi1);
        sayilar.add(sayi2);
        sayilar.add(sayi3);
        sayilar.add(sayi4);

        //azalan ve artan olarak sıralıyoruz.
        //sayi1
        Integer silinecek;

        for (Integer each : sayilar)
        {
            if (each>sayi1)
            {
               sayi1=each;
            }
        }
        silinecek=sayi1;
        sayilar.remove(silinecek);
        //sayi2
        for (Integer each : sayilar)
        {
            if (each>sayi2)
            {
                sayi2=each;
            }
        }
        silinecek=sayi2;
        sayilar.remove(silinecek);
        //sayi3
        for (Integer each : sayilar)
        {
            if (each>sayi3)
            {
                sayi3=each;
            }
        }
        silinecek=sayi3;
        sayilar.remove(silinecek);
        //sayi4
        for (Integer each : sayilar)
        {
            if (each>sayi4)
            {
                sayi4=each;
            }
        }

        String buyukSayiMetin =""+sayi1+sayi2+sayi3+sayi4;
        int buyukSayi= Integer.parseInt(buyukSayiMetin);

        return buyukSayi;
    }
    public static int orderToDescending(int girilenSayi){
        int sayi1,sayi2,sayi3,sayi4=0;
        sayi1=girilenSayi%10;
        //basamktan kurtul
        girilenSayi=girilenSayi/10;
        sayi2=girilenSayi%10;
        //basamaktan kurtul
        girilenSayi=girilenSayi/10;
        sayi3=girilenSayi%10;
        girilenSayi=girilenSayi/10;
        sayi4=girilenSayi%10;

        //rakamlari list'e aldık
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(sayi1);
        sayilar.add(sayi2);
        sayilar.add(sayi3);
        sayilar.add(sayi4);

        //azalan ve artan olarak sıralıyoruz.
        //sayi1
        Integer silinecek;

        for (Integer each : sayilar)
        {
            if (each>sayi1)
            {
                sayi1=each;
            }
        }
        silinecek=sayi1;
        sayilar.remove(silinecek);
        //sayi2
        for (Integer each : sayilar)
        {
            if (each>sayi2)
            {
                sayi2=each;
            }
        }
        silinecek=sayi2;
        sayilar.remove(silinecek);
        //sayi3
        for (Integer each : sayilar)
        {
            if (each>sayi3)
            {
                sayi3=each;
            }
        }
        silinecek=sayi3;
        sayilar.remove(silinecek);
        //sayi4
        for (Integer each : sayilar)
        {
            if (each>sayi4)
            {
                sayi4=each;
            }
        }

        String kucukSayiMetin =""+sayi4+sayi3+sayi2+sayi1;
        int kucukSayi= Integer.parseInt(kucukSayiMetin);

        return kucukSayi;
    }
}
