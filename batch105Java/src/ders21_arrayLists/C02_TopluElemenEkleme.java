package ders21_arrayLists;
import java.util.ArrayList;
import java.util.List;

public class C02_TopluElemenEkleme {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();

        //Tüm sesli harfleri listeye ekleyin.
        // Eklenecek tüm elementleri bir array olarak yazıp
        //sonra for loop ile list'e ekleyebiliriz.

        String [] unluHarfler = {"a","e","i","o","u"};

        for(int i=0;i< unluHarfler.length;i++)
        {
            harfler.add(unluHarfler[i]);
        }
        System.out.println(harfler);
    }
}
