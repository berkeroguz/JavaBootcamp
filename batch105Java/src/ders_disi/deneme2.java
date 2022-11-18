package ders_disi;


public class deneme2 {

    static int sayi=10;

    deneme2(){
        ++sayi;
        System.out.println("Constructor çalıştı ve sayi = " +sayi);
    }

    static {
        ++sayi;
        System.out.println("üst static çalıştı blok çalıştı. sayi = " + sayi);
    }
    public static void main(String[] args) {
        System.out.println("main method çalıştı, sayi = "+sayi);
        deneme2 deneme = new deneme2();

    }

    static {
        ++sayi;
        System.out.println("Alt static çalıştı ve sayi = "+sayi);
    }
}
