package ders16_doWhileLoop;

import java.util.Scanner;

public class WhileLoopSoru {
    //Kullanıcıdan sayı isteyiniz, girilen sayıları toplayınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam=0;
        boolean durum = true;
        //10 ile 100 arasındaki asal sayıları yazdıran program.

        do {
            System.out.println("Lütfen toplamak istediğiniz sayıyı giriniz. Bitirmek için 0 'a basınız.");
            int input = scan.nextInt(); //kullanıcıdan veriyi aldık.
            if (input == 0) //Döngü çıkış yeri, program bitiş.
            {
                durum=false; //Şartı bozacak şekilde parametre ayarlanır.
            }
            else
            {
                toplam=toplam+input; //Ard arda toplama işlemi yapılır.
            }
        }
        while(durum);
        System.out.println("Girdiğiniz sayıların toplamı = " +toplam);


        /*
        for (int i=0;i<5;i--) //Sonsuz döngü oluşturmaya çalıştık.
        {
            System.out.println("Lütfen toplamak istediğiniz sayıyı giriniz. Bitirmek için 0 'a basınız.");
            int input = scan.nextInt(); //kullanıcıdan veriyi aldık.
            if (input == 0) //Döngü çıkış yeri, program bitiş.
            {
                i=7; //Şartı bozacak şekilde parametre ayarlanır.
            }
            else
            {
                toplam=toplam+input; //Ard arda toplama işlemi yapılır.
            }
        }
        System.out.println("Girdiğiniz sayıların toplamı = " +toplam);
        /*int i=-;
        boolean durum = true;
        //Programda kullanıcı isterse 100 tane sayı girer, isterse 2 tane sayı girer...
                while(durum) //Durum true mi?
                {
                    System.out.println("Lütfen toplamak istediğiniz sayıyı giriniz. Bitirmek için 0 'a basınız.");
                    int input = scan.nextInt(); //kullanıcıdan veriyi aldık.

                    if (input ==0)
                    {
                        durum=false; i=1;
                    }
                    else
                    {
                        toplam=toplam+input; //Ard arda toplama işlemi yapılır.
                    }

                }
        System.out.println("Girdiğiniz sayıların toplamı = " +toplam);
*/
    }
}
