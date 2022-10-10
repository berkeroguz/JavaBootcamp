package ders_disi;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük tam sayı giriniz.");
        int sayi=scan.nextInt();

        int faktoriyel = 1;

        System.out.print(sayi+"!"+ " =");

        for (int i=1;i<=sayi;i++)
        {
            faktoriyel=faktoriyel*i;
            if(i!=sayi) {
                System.out.print(i+ " * ");
            }
            else {
                System.out.print(i);
            }

        }
        System.out.print(" = "+faktoriyel);

    }
}
