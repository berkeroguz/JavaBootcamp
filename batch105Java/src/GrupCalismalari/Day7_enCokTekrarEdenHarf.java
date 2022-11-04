package GrupCalismalari;

import java.util.Arrays;
import java.util.Scanner;

public class Day7_enCokTekrarEdenHarf {
    //Kullanıcıdan bir metin istiyoruz, girlen metinde
    // en çokt ekrar eden harfi çıktı olarak veriyoruz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz.");
        String metin = scan.nextLine();
        metin = metin.toLowerCase();
        //GALATASARAY
        char [] harfler = new char[metin.length()];

        for(int i=0;i<metin.length();i++) //Girilen metni diziye alıyoruz.
        {
            harfler [i] = metin.charAt(i);
        }
        int tekrarSayisi=0;
        int enCokTekrarSayisi=0;
        char enCokTekrarEdenHarf = 0;
        for (int i=0; i<harfler.length;i++) //Tüm harfleri tek tek dolaş.
        {
            //abc
            tekrarSayisi=0;
            for (int s=0;s<harfler.length;s++) // Her bir harfi , dizideki tüm harflerle dolaş.
            {
                if (harfler[i]==harfler[s])
                {
                    tekrarSayisi++;
                }
            }

            if(tekrarSayisi>enCokTekrarSayisi)
            {
                enCokTekrarSayisi=tekrarSayisi;
                enCokTekrarEdenHarf = harfler[i];
            }
        }
        System.out.println("En çok tekrar eden harf = " + enCokTekrarEdenHarf);
    }


}
