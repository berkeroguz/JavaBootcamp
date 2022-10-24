package GrupCalismalari;

public class Day4_ElementleriToplama {
    public static void main(String[] args) {

        int [] sayilar = {1,2,3,4,5};
        int sonuc=0;
        for (int i=0;i<sayilar.length;i++)
        {
            sonuc = sonuc+sayilar[i];
        }
        System.out.println(sonuc);
        sonuc=0;
        for (int eleman : sayilar)
        {
            sonuc = sonuc + eleman;
        }
        System.out.println(sonuc);
    }
}
