package GrupCalismalari;

import java.util.Scanner;

public class Day2_Calisma2 {
    public static void main(String[] args) {

        // kullanıcıdan sureklı bir sayi alalım
        // sayıları toplayalım X bastıgında bitir.

        int girilenSayi =1;
        int toplam =0;
        Scanner scan = new Scanner(System.in);
        while (girilenSayi!=0){
            System.out.println("Lutfen toplamak icin sayi giriniz : "+
                    "\nBitirmek icin 0'a basınız");
            girilenSayi= scan.nextInt();
            if (girilenSayi==0){
                break;
            }else {
                toplam+=girilenSayi;
            }
        }
        System.out.println("sayilarin toplami : " + toplam);

    }
}
