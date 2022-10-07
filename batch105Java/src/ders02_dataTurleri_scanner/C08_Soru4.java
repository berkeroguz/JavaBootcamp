package ders02_dataTurleri_scanner;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class C08_Soru4 {
    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ilk sayıyı girin.");
        int sayi1=scan.nextInt();

        System.out.println("Lütfen ikinci sayıyı girin.");
        int sayi2= scan.nextInt();

        int bos;
        bos=sayi2;
        sayi2=sayi1;
        sayi1=bos;


        System.out.println("Girdiğiniz sayılar değiştirildi.");
        System.out.println("1. Sayı " + sayi1 + " olarak değiştirildi.");
        System.out.println("2. Sayı " + sayi2 + " olarak değiştirildi.");





    }
}
