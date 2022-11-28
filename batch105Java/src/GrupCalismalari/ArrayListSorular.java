package GrupCalismalari;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSorular {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);

        sayilar.replaceAll(a -> a+8);
        // replaceAll methodu ile , her bir elemanda aynı değişikliği yapmak istediğimizde tüm elemanları tek tek dolaşarak
        // gerekli işlemi yapar.  işin içine if girmiyorsa en mantıklısı bu.
        System.out.println("sayilar = " + sayilar);
        int yeniDeger=0;
        for (int i=0;i<sayilar.size();i++)
        {
            yeniDeger= sayilar.get(i)-8;
            sayilar.set(i,yeniDeger);
        }

        System.out.println("sayilar = " + sayilar);

    }
}
