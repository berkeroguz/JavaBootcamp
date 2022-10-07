package ders10_stringManipulation;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {

        /*
            mail kontrolü yapan bir program hazırlayın.
            1- mail @ işareti içermiyorsa geçersiz email yazdır.
            2- @gmail.com içermiyorsa "gmail hesabı giriniz".
            3- @gmail.com ile bitmiyorsa yazim hatası.
         */

        String email = "@gmail.comselam";

        if (!email.contains("@"))
        {
            System.out.println("Geçersiz email");
        }
        else if (!email.contains("@gmail.com"))
        {
            System.out.println("Gmail adresi giriniz.");
        }
        else if (!email.endsWith("@gmail.com"))
        {
            System.out.println("Yazım hatası.");
        }
        else {
            System.out.println("e mail başarı ile kaydedildi.");
        }



    }
}
