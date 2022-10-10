package ders11_stringManipulation;

public class C06_Soru1 {
    public static void main(String[] args) {

       /* : Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
                - cumlede is geciyorsa, "calismak guzeldir"
                - ikisini de iceriyorsa "Hem ev lazim hem is"
                - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        */

        String str="isim cok iyi";

        str=str.toLowerCase();

        if (str.contains("ev"))
        {
            System.out.println("home home sweet home");
        }
        else if (str.contains("is"))
        {
            System.out.println("Çalışmak güzeldir");
        }
        else if (str.contains("ev") && str.contains("is"))
        {
            System.out.println("Hem ev lazim hem is");
        }
        else if (!str.contains("ev") && !str.contains("is"))
        {
            System.out.println("Çok çalışman lazım");
        }
    }
}
