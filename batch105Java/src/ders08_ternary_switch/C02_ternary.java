package ders08_ternary_switch;

public class C02_ternary {
    public static void main(String[] args) {

        String str1= "Ali";
        String str2= "ali";

        // verile iki metin birbiri ile aynı ise "metinler aynı"
        // farkli ise "metinler farklidir" yazdır

        System.out.println(str1.equals(str2) ? "Metinler ayni" : "Metinler Farklı" );


    }
}
