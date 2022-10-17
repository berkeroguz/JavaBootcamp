package ders_disi;

import java.util.Scanner;

public class ders16_SifreKontroluDeneme {




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
