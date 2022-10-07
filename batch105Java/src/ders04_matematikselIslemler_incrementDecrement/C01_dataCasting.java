package ders04_matematikselIslemler_incrementDecrement;

public class C01_dataCasting {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 5 ;

        System.out.println(sayi1/sayi2);
        //bölünen ve bölen ikisi de tam sayı ise java sonucun sadece tamsayi kismini alır

        double sayi3=6;

        System.out.println(sayi1/sayi3); //int /double == geniş olana göre alır. double'yi alır.
    }
}
