package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // 10,11,12 sayılarını toplayna bir while dööngü
        int sayi=10;
        int toplam=0;
        while(sayi<13)
        {
            toplam=toplam+sayi;
            sayi++;
        }
        System.out.println(toplam);

        /*
            While loop'da 2 problem oluşabilir.
            1- Once değeri kontrol edipğ, sonra işlem yaptığımızdna body'de bir kere daha kontrol etmemiz gerekebilir.
            2-  yapılan işlem sayisindan 1 fazla while bitis sarti kontrol edilir
            3- While loop öncesinde değerleri kontrol edeceğimiz bir variable oluşturuyorsak ona yapacağımız
            atamayı dikkatli yapmamız gerekir.
            Yanlis değer ataması yapmak, while loop2un calismamasına neden olabilir.

         */

    }
}
