package ders03_datacastingWrapperClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C05_Swap {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen a sayısını giriniz.");
        int a=scan.nextInt();

        System.out.println("Lütfen b sayısını giriniz.");
        int b= scan.nextInt();

        a = a + b;  // a'ya iki sayının toplamlarını attık.
        b= a-b ; // a'dan b'yi çıkararak a'nın ilk değerini b'ye eşitledik.
        a= a-b; //a'dan b'nin yeni değerini yani eski a'yı çıkartarak b'yi elde ettik

        System.out.println("a'nın yeni değeri : " + a);
        System.out.println("b'nin yeni değeri : " + b);


    }
}
