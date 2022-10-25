package GrupCalismalari;

public class Day2_Calisma3 {
    public static void main(String[] args) {
        // k harfinden t harfine kadar yazdirin.
        int a = 107;

        while (a < 117) {

            char c = (char) (a);
            a++;

            System.out.print(" " + (char) (a));
        }
    }
}
