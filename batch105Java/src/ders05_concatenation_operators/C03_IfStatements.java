package ders05_concatenation_operators;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin
        // eger birinci sayi 100'den buyukse , "ilk sayi 100'den buyuk" yazdirin
        // eger ikinci sayi ciftse, "ikinci sayi cift yazdirin"
        // eger ilk sayi, ikinci sayidan buyukse , "ilk sayi daha buyuk" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 tam sayı giriniz.");
        int a = scan.nextInt();
        int b= scan.nextInt();

        if (a>100){
            System.out.println("İlk sayı 100'den büyük.");
        }
        if (b%2==0)
        {
            System.out.println("İkinci sayı çifttir.");
        }
        if (a>b)
        {
            System.out.println("İlk sayı ikinci sayıdan büyük.");
        }

    }
}
