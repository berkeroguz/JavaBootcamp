package ders13_nastedForLoop_methodOlusturma;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz.");
        String metin= scan.next();

        for (int i=metin.length()-1;i>=0;i--)
        {
            System.out.print(metin.charAt(i));

            // SUBSTRING ILE


        }

    }
}
