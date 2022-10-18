package ders18_arrays;

public class C05_Soru3 {
    private static int sayilar;

    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var
        // olup olmadigini ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {1,2,4,5,3,6,7,4,2,3,5,1,3,2};
        elemanBul(arr,3);
    }
    public static void elemanBul(int[] arr,int arananEleman){

        int sayac=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==arananEleman) sayac++;
        }

        if(sayac<=0)
        {
            System.out.println(arananEleman + " Bu dizide hiç kullanılmamıştır.");
        }
        else {
            System.out.println("aranan eleman "+ arananEleman + "   " + sayac+ " kez tekrar edilmiştir.");
        }

    }
}
