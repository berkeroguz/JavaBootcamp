package GrupCalismalari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSoru2 {
    //Soru 6- Kullanicidan pozitif bir tamsayi alip,
    //        o tamsayiyi tam bolebilen= % 0 tum pozitif tamsayilari
    //        bir liste olarak bize donduren bir method olusturun.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz.");
        int ilhan = scan.nextInt();
        List<Integer> sayilar2=new ArrayList<>();
        sayilar2=listOlustur(ilhan);
        System.out.println("sayilar2 = " + sayilar2);

    }
    public static List<Integer> listOlustur(int input){
        //1'den sayıa kadar tüm elemanları dolaşacak.
        List<Integer> sayilar = new ArrayList<>();
        for (int i=1;i<=input;i++)
        {
            if(input % i==0) //Eğer sayı tam bölünüyorsa liste ekle.
            {
                sayilar.add(i);
            }
        }
        return sayilar;
    }
}
