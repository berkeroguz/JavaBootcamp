package ders10_stringManipulation;

public class C09_Soru {
    public static void main(String[] args) {

                /*
        Kullanıcıdan bir cumle ve bir metin alın
        cumlede metnin durumuna göre
        1- cümle metni içermiyor
        2- cümle metni sadece 1 kere içeriyor
        3- cümle metni birden fazla içeriyor

        seceneklerinden uygun olanı yazdırın.

         */

        String cumle="Java harika efsane bir şeydir.";
        String metin="harika";

        int ilkIndex=cumle.indexOf(metin);
        int sonIndex=cumle.lastIndexOf(metin);

        if (ilkIndex==(-1))
        {
            System.out.println("Cümle metni içermiyor");
        } else if (ilkIndex==sonIndex) {
            System.out.println("cumle metni sadece 1 kere içeriyor");
        }
        else {
            System.out.println("cümle metni birden fazla i,çeriyor.");
        }


    }
}
