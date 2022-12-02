package ders41_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Calisma2 {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Berker");
        isimler.add("Ahmet");
        isimler.add("Mehmet");
        isimler.add("Recep");
        isimler.add("Ali");
        isimler.add("Ece");
        ListIterator it1 = isimler.listIterator();
        
        while(it1.hasNext())
        {
            System.out.print(it1.next()+ " ");
        }
        System.out.println();
        while(it1.hasPrevious())
        {
            System.out.print(it1.previous()+" ");
        }
    }
}
