package ders10_stringManipulation;

public class C07_Soru {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir cumle ve bir metin alın
        cumlede metnin durumuna göre
        1- cümle metni içermiyor
        2- cümle metni sadece 1 kere içeriyor
        3- cümle metni birden fazla içeriyor

        seceneklerinden uygun olanı yazdırın.

         */

        String cumle = "Java cok guzeldir cok.";
        String metin="cok";

        if(!cumle.contains(metin)) // Eğer cümle 'metin' ' i içermiyorsa ..
        {
            System.out.println("cümle metni içermiyor");
        }
        else{
            int ilkIndex=cumle.indexOf(metin);
            if (cumle.indexOf(metin,ilkIndex+1)>0)
            {
                System.out.println("Cümle metni birden fazla içeriyor");

            }
            else {
                System.out.println("cümle metni 1 kere içeriyor.");
            }
        }


    }
}
