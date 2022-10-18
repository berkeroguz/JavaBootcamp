package ders18_arrays;

public class C03_Soru1 {
    public static void main(String[] args) {

        //Soru 1- Verilen bir int array’in tum elemanlarini
        // 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int [] sayilar = {1,2,3,4,5};
        diziyeIkiEkle(sayilar);



    }
    public static int[] diziyeIkiEkle(int[] sayilar)
    {
        for (int i =0; i<sayilar.length;i++)
        {
            sayilar[i]=sayilar[i]+2;
        }
        return sayilar;
    }
}
