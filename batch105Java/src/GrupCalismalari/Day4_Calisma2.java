package GrupCalismalari;

import java.util.Scanner;

public class Day4_Calisma2 {
    public static void main(String[] args) {
        //Girilen sayının faktöriyelini bulan programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int girilenSayi=scan.nextInt();
        int faktoriyelSonuc=1;
        System.out.print(girilenSayi+ "! = ");
        for(int i=girilenSayi;i>0;i--)
        {
            faktoriyelSonuc = faktoriyelSonuc*i;
            if(i==1)
            {
                System.out.print(i);
            }
            else
            {
                System.out.print(i+"*");
            }
        }
        System.out.print(" = "+faktoriyelSonuc);

    }
}
