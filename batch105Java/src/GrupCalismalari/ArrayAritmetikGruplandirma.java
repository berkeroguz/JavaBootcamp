package GrupCalismalari;

import java.util.Arrays;

public class ArrayAritmetikGruplandirma {
    public static void main(String[] args) {
        //giriş array {3,5,1,2,7,9,2,3,5,7}

        String[] dizi1 = {"a", "b", "c", "d", "e", "f", "g", "h", "j","k"};
        AritmetikSirala(dizi1);
    }
    public static void AritmetikSirala(String[] dizi1){
        String[] dizi =null;
        String yeniIndex = "";
        int indexNo=0;
        int sayac=0;
        for (int i=sayac;i<dizi.length;i++) // 4 kere dönecek, diziye eleman ekleyecek.
        {
            sayac++;
            for (int j=0;j<sayac;j++) // önce 1 kere, sonra 2 kere,3 kere 4 kere dönecek.
            {
                yeniIndex=yeniIndex+dizi1[indexNo]+"+"; //İlk dizideki
                indexNo++;
            }
            yeniIndex=yeniIndex.substring(0,yeniIndex.length()-1);
            dizi[i]=yeniIndex;
            yeniIndex="";
        }
        System.out.println(Arrays.toString(dizi1));
        System.out.println(Arrays.toString(dizi));

    }
}
