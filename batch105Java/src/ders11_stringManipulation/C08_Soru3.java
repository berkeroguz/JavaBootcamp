package ders11_stringManipulation;

public class C08_Soru3 {
    public static void main(String[] args) {

       /* Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
       ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
       eger tum sartlari saglarsa,
       “sifre basariyla kaydedildi” yazdirin
                - ilk harf kucuk harf olmali
        - son karakter rakam olmali
                - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali

        */

        String sifre ="Nasilsin Kardes";

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){

            System.out.println("İlk harf küçük harf olmalı");

        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9'))
        {
            System.out.println("Son karakter rakam olmalı");
        }
        if (!sifre.contains(" "))
        {

        }

    }
}
