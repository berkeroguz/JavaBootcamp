package ders02_dataTurleri_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C06_Soru2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Dikdörtgenin iki kenar uzunluğunu girin " +

                "\n İki kenar uzunluğu arasında enter'a basın");

        int dik=scan.nextInt();
        int kisa=scan.nextInt();

        System.out.println("Dikdörtgenin alanı = "+ dik*kisa + " Santimetrekare");


    }
}
