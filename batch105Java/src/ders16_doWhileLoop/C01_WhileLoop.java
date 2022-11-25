package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // 10,11,12 sayılarını toplayna bir while dööngü
        int sayi=10;
        int toplam=0;
        while(sayi<13) //True değerini koruduğu sürece body tekrar ve tekrar çalışır.
        {
            toplam=toplam+sayi;

        }
        // For döngüsünde bitiş değerini bilmediğimiz için while döngüsüne göre zorlukları bulunabilir.
        for (int i=10;i<13;i++) // For döngüsünde şart doğru ise döngü 1 kez çalışır Arttırma yapmaz, sonraki dönüşlerinde arttırmayı uygular.
        {
            toplam=toplam+i;
        }
        System.out.println(toplam);

        /*
            While loop'da 2 problem oluşabilir.
            1- Once değeri kontrol edipğ, sonra işlem yaptığımızdan body'de bir kere daha kontrol etmemiz gerekebilir.
            2-  yapılan işlem sayisindan 1 fazla while bitis sarti kontrol edilir
            3- While loop öncesinde değerleri kontrol edeceğimiz bir variable oluşturuyorsak ona yapacağımız
            atamayı dikkatli yapmamız gerekir.
            Yanlis değer ataması yapmak, while loop2un calismamasına neden olabilir.

         */

    }
}
