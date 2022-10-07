package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Soru3 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen İsminizi Girin = ");
        String name = scan.nextLine(); //String için kullanılabilen next() Sadece ilk space'e kadar olan kısmı alır.
        //nextLine ise o satırı komple alır.

        System.out.println("Lütfen Soyisminizi girin.");
        String lastname = scan.nextLine();

        System.out.println("Yaşınızı giriniz.");
        int age=scan.nextInt();

        System.out.println("İsminiz = "+ name);
        System.out.println("Soyisminiz ="+ lastname);
        System.out.println("Yaşınız = " + age);
        System.out.println("Kaydınız başarıyla tamamlanmıştır.");


    }
}
