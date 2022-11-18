package GrupCalismalari;

public class C02_StringManipulationSoru1 {
    /*
     Kullanıcıdan bir cumle ve bir metin alın
     cumlede metnin durumuna göre
         1- cümle metni içermiyor
         2- cümle metni sadece 1 kere içeriyor
         3- cümle metni birden fazla içeriyor
     seceneklerinden uygun olanı yazdırın.

             */
    public static void main(String[] args) {
        String cumle = "Java  harika  bir şeydir.";
        String metin = "cok";

        if (!cumle.contains(metin)) //Eğer cümle metin'i içermiyorsa....
        {
            System.out.println("Cümle metni içermiyor.");
        } else {
            int ilkindex = cumle.indexOf(metin); //Cümle değişkenimin içerisindeki metin ifadesinin başlangıç indeksini bu değişkene atadım.
            if (cumle.indexOf(metin, ilkindex + 1) > 0) //Yani cumle değişkenimde metin ifadesi 1den fazla kez tekrar ediyorsa...
            {

                System.out.println("Cümle metni birden fazla kez içeriyor.");
            } else {
                System.out.println("Cümle metni 1 kere içeriyor.");
            }
        }
    }


}
