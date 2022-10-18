package ders18_arrays;

public class C04_Soru2 {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
        int[] sayilar={-2,-3,-5,2,3};

        System.out.println(arrayTopla(sayilar));

    }
    public static int arrayTopla(int[] sayilar)
    {
        int sonuc=0;
        for(int i=0;i<sayilar.length;i++)
        {
            if(sayilar[i]>0)
            {
                sonuc=sonuc+ sayilar[i];
            }
        }
        return sonuc;
    }
}
