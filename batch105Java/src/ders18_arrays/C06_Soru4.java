package ders18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Soru4 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
        // array’i olusturan ve bize donduren bir method olusturun.
        System.out.println(Arrays.toString(arrayOlustur()));

    }

    public static int[] arrayOlustur(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Array'in boyutunu giriniz = ");
        int length=scan.nextInt();

        int [] kullaniciArrayi=new int[length];

        for (int i=0;i<length;i++)
        {
            System.out.println("Lütfen " + i +". elementi giriniz.");
            kullaniciArrayi[i]= scan.nextInt();
        }

        return kullaniciArrayi;
    }
}
