package GrupCalismalari;

public class C03_StringManSoru2 {
    /* : Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
                - cumlede is geciyorsa, "calismak guzeldir"
                - ikisini de iceriyorsa "Hem ev lazim hem is"
                - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        */

    public static void main(String[] args) {

        String str="java cok güzel";

        str=str.toLowerCase();

        if(str.contains("ev") && str.contains("is"))
        {
            System.out.println("hem ev lazım hem iş");
        }
        else if(str.contains("is"))
        {
            System.out.println("çalışmak güzeldir.");
        }
        else if(str.contains("ev"))
        {
            System.out.println("Home home sweet home");
        }
        else if(!(str.contains("ev") && str.contains("is"))) // (asdasdf || dsfgdsfdf) && dsfhdsfhdsfh
        {
            System.out.println("Çok çalışman lazım.");
        }

    }
}
