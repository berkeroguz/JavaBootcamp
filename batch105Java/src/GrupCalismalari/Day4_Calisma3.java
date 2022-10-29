package GrupCalismalari;

import java.util.Scanner;

public class Day4_Calisma3 {
    public static void main(String[] args) {
        //Kullanicidan sayi ve üssü isteyin . Üslü ifadenin sonucunu yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Önce sayıyı girin , sonra üssü girin.");
        int sayi = scan.nextInt();
        int ussu = scan.nextInt();
       //if blokları koyulur. double
        int carpim=1;
        // 2 üzeri 5  2'yi 5 defa çarpması lazım.
        for (int i=1;i<=ussu;i++)
        {
            carpim = carpim * sayi;
        }
        System.out.println(sayi + " Üzeri " + ussu + " = " + carpim);
    }
}
