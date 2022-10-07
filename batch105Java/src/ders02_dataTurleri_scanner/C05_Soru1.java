package ders02_dataTurleri_scanner;
import java.util.Scanner;

public class C05_Soru1 {
    public static void main(String[] args) {

        //bir double bir int sayı isteyip toplayıp çarpın

        Scanner scan = new Scanner(System.in);

        System.out.println("Double sayıyı gir");
        double sayi1=scan.nextDouble();

        System.out.println("Lütfen bir tam sayı gir");
        int sayi2=scan.nextInt();

        System.out.println("Toplamları = "+ (sayi1+sayi2));
        System.out.println("Çarpımları = "+ sayi1*sayi2);



    }
}
