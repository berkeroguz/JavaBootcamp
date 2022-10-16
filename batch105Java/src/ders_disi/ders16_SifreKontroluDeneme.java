package ders_disi;

import java.util.Scanner;

public class ders16_SifreKontroluDeneme {
     /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
        ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        - Sifre kucuk harf icermelidir ŞART 1
        - Sifre buyuk harf icermelidir ŞART 2
        - Sifre ozel karakter icermelidir ŞART 3
        - Sifre en az 8 karakter olmalidir. ŞART 4
           SADECEa54
         */



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sifre;
        int bayrak=0;
        do {
            System.out.println("Lütfen bir şifre giriniz.");
            sifre=scan.nextLine();
            bayrak= kucukHarfKontrolEt(sifre)+buyukHarfKontrolEt(sifre)+ozelHarfKontrolEt(sifre)+karakterSayisiBul(sifre);
            System.out.println(bayrak);
        }
        while(bayrak!=4); //Şart sağlandığı sürece çalışır.
        System.out.println("Şifre başarılı bir şekilde girildi.");
    }

    public static int kucukHarfKontrolEt(String sifre){
        int kontrolBayrak=0;

        for (int i=0;i<sifre.length();i++)
        {
            if(sifre.charAt(i)>='a' && sifre.charAt(i)<='z')
            {
                kontrolBayrak++;
                break; //
            }
        }

        if(kontrolBayrak==0)
        {
            System.out.println("Lütfen şifreniz en az 1 küçük harf içermelidir.");
            return 0;
        }
        else return 1;

    }
    public static int buyukHarfKontrolEt(String sifre){
        int kontrolBayrak=0;

        for (int i=0;i<sifre.length();i++)
        {
            if(sifre.charAt(i)>='A' && sifre.charAt(i)<='Z')
            {
                kontrolBayrak++;
                break;
            }
        }
        if(kontrolBayrak==0){
            System.out.println("Lütfen şifreniz en az 1 büyük harf içermelidir.");
            return 0;
        }
        else return 1;

    }
    public static int ozelHarfKontrolEt(String sifre){
        int kontrolBayrak=0;
        String ozelkarakterler="§±@!$%^&*()_-+=?/>.<,`~#";
        for(int i= 0 ; i<sifre.length();i++){
            if(sifre.contains(ozelkarakterler.substring(i,i+1)))
            {
                kontrolBayrak++;
                break;
            }
        }
        if(kontrolBayrak==0)
        {
            System.out.println("Lütfen şifreniz en az bir özel karakter içermelidir.");
            return 0;
        }
        else return 1;
    }
    public static int karakterSayisiBul(String sifre){
        if(sifre.length()<8){
            System.out.println("Şifreniz en az 8 karakterden oluşmalıdır.");
            return 0;
        }
        else return 1;
    }
}
