package GrupCalismalari;
public class Inheritance {
    /*
            1- Miras
            2- Baba-oğul
            3- Kalıtım
            4- extends keyword'u ile kullanım sağlıyoruz
            5- Parents Child ilişkisinde kullanılır.
            6- Child classlar parent'taki her şeye ulaşabilir. ( Private olarak belirlenen değişkenlere ulaşamaz.)
            7- Protected olarak işaretlenen bir değişken, farklı bir package'dan kullanılamaz.
     */

    /*
        Öğrenci kredisi ayrı hesaplanır,
        İhtiyaç kredisi , Askeri kredi , Konut kredisi...

        Kullanıcıdan alınan bilgiye göre ve kredi çeşidine göre, kaç para faiz uygulanacagı ve vadesi ...
        öğrenci : 1.18
        Askeri : 1.25
        Konut : 1.50
     */

    public int sayi;
    public String isim;

    public void ekleme()
    {
        System.out.println("Ekleme methodu çalıştış.");
    }
}
