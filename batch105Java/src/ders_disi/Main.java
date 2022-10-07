package ders_disi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz.");
        int sayi=scan.nextInt();

        if(sayi % 2 == 0) // Eğer sayı 2ye bölündüğünde kalanı 0 ise o zaman çifttir ve alttaki kodlar işler.
        {
            if (sayi%10 ==0) // Eğer sayı 10 ile bölümden kalanı 0 veriyorsa 10'un katıdır. ( Örn. 60/10 %= 0'dır)
            {
                System.out.println("Girdiğiniz sayı 10'un katıdır.");
            }
            else // 0'dna farklı bir kalan veriyorsa...
            {
                System.out.println("Girdiğiniz sayı 10'un katı değildir.");
            }


        }
        else // Sayı'nın 2 ile bölümünden kalan 0 değilse o zaman sayı tektir. ( Örn 7/2 %= 1 'dir)
        {
            if (sayi<0) // sayı negatif mi?
            {
                System.out.println("Girdiğiniz sayı negatif bir sayıdır.");
            }
            else // Negatif değilse pozitiftir.
            {
                System.out.println("Girdiğiniz sayı pozitif bir sayıdır.");
            }
        }
    }
}
