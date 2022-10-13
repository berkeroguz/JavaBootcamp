package ders13_nastedForLoop_methodOlusturma;

public class C02_StringTersineCevirme {
    public static void main(String[] args) {

        //Kullanıcıdan bir string isteyin ve strngi tersten yazdırın.

        String input = "Java her geçen gün güzelleşiyor";
        String tersInput="";

        for(int i=input.length()-1;i>=0;i--)
        {
            tersInput=tersInput+input.charAt(i);
        }
        System.out.println(tersInput);
    }
}
