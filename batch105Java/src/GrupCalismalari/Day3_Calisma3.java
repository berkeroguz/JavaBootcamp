package GrupCalismalari;
import java.util.Arrays;

public class Day3_Calisma3 {
    public static void main(String[] args) {
        String [] isimler = {"İlhan","Berker", "Tugay","Yasir"};

        for (int i=0;i<isimler.length;i++)
        {
            isimler[i] = "tester";
        }
        System.out.println(Arrays.toString(isimler));
        System.out.println("");
        System.out.println("ikisinin arasındaki fark");

        for (String i : isimler){
            System.out.println(i);
        }
    }




}
