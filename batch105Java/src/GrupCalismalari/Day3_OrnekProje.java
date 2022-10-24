package GrupCalismalari;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Day3_OrnekProje {

    // Bir menüsü olsun.
    // Öğrenci Ekleme
    // Öğrenci Çağırma
    //Önce kullanıcıdan girilen öğrencileri list'e eklemesini sağlayan method yazın.

    public static void main(String[] args) {
        //Buraya çalıştırma kodları yazılacak.
        //ogrenciCagir(list);
        Scanner scan = new Scanner(System.in);

        int giris=-1;
        while(!(giris==0))
        {
            System.out.println("\t \t*****HOŞ GELDİNİZ****** \n" + "Lütfen Öğrenci Eklemek için 1'e basınız. \n"
            + "Lütfen Öğrencileri Listelemek için 2'ye basınız. \n" + "Programı kapatmak için 0'a basınız. \n");

            giris=scan.nextInt(); //kullanıcıdan veriyi alıyoruz
            if (giris==1)
            {
                // OgrenciEkle() = ogrenciler
                for (String ogrenci : OgrenciEkle())
                {
                    System.out.println(ogrenci);
                }
                System.out.println("Öğrenciler başarılı bir şekilde eklenmiştir.");
                //Öğrenci ekleme kodları
            }
            else if(giris==2)
            {
                OgrenciCagir();
                //Öğrenci Listeleyecek
            }
            else {
                System.out.println("Lütfen uygun bir değer giriniz.");
            }
        }
        System.out.println("Program kapatılmıştır.");
    }
    static List<String> ogrenciler = new ArrayList<String>();
    public static List<String> OgrenciEkle() {
    //Çalışan kod en iyi koddur.
        String ogrenci;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Lütfen bir öğrenci giriniz. Bitirmek istiyosanız 0'a basın.");
            ogrenci = scan.nextLine();
            if (ogrenci.equals(0))
            {
                break;
            }
            else ogrenciler.add(ogrenci);
        }
        while (!(Objects.equals(ogrenci, "0")));
        ogrenciler.remove(ogrenciler.size()-1);
        return ogrenciler;
    }
    public static void OgrenciCagir(){

        for (String ogrenci: ogrenciler)
        {
            System.out.print(ogrenci+",");
        }
        System.out.println("");


    }
}
