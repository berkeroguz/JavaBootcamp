package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C04_DataCastingChar {
    public static void main(String[] args) {

        System.out.println('a'+'b'); // 97 + 98 = 195 yazdırdı. ASCII Değerini aldı.
        //Kullanıcıdan char bir karakter alin
        // O karakterden sonra gelen 3 harfi yazdırın.
        //Ornek input : a yazarsa output: b,c,d

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir char girin");
        char chr = scan.next().charAt(0); //Girilen kelimenin 0.indeksini al

        System.out.println("" + (char)(chr+1) + " , " + (char)(chr+2) ); //(Char) ekleyerek düzeltiyoruz.
        //Stringe dönüğştürmek için en başa "" koyarız. hiçlik ekleriz.



    }
}
