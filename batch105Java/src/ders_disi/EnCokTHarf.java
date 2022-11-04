package ders_disi;

import java.util.Arrays;
import java.util.Scanner;

public class EnCokTHarf {
    public static void main(String[] args) {

        //Kullanıcıdan bir metin iste. En çok tekrar eden harfi ekrana yazdır.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz . ");
        String metin = scan.nextLine();
        metin = metin.toLowerCase();
        char [] harfler = new char[metin.length()];
        for(int i=0;i<metin.length();i++)
        {
            harfler[i]=metin.charAt(i);
        }
        char enCokTekrarEdenHarf = 0;

        int tekrarSayisi=0;
        int enCokTekrarSayisi=0;
        for (int i = 0;i<harfler.length;i++) //Tüm harfleri dolaşsın
        {
            tekrarSayisi=0;
            for (int a=0;a<harfler.length;a++)
            {
                if(harfler[i]==harfler[a]) // Tekrar eden harfin kaç kere tekrar ettiğini buluyoruz.
                {
                    tekrarSayisi++;
                }
            }
            if (tekrarSayisi>enCokTekrarSayisi) //Eğer bir sayı daha önceki tekrar eden sayıdan daha cok tekrar ettiyse...
            {
                enCokTekrarSayisi=tekrarSayisi;
                enCokTekrarEdenHarf= harfler[i];
            }
        }
        System.out.println("Girdiğiniz metinde en çok tekrar eden karakter = "+ enCokTekrarEdenHarf);


    }
}
