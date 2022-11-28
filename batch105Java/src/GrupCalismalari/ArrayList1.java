package GrupCalismalari;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>();
        isimler.add("Ahmet");
        System.out.println(isimler);
        isimler.add("Yasir");
        isimler.add("Berker");
        isimler.add("İlhan");
        System.out.println(isimler);
        isimler.set(2,"Oğuz");
        System.out.println("isimler = " + isimler);
        isimler.add("mehmet");
        isimler.add(1,"Hasan");
        System.out.println(isimler);
        System.out.println(isimler.contains("Oğuz"));
        System.out.println("isimler.size() = " + isimler.size());
        System.out.println("isimler.get(2) = " + isimler.get(2));
        System.out.println("isimler.remove(0) = " + isimler.remove(0));
        System.out.println(isimler);
       // isimler.clear(); // listi temizledik.
        System.out.println("isimler = " + isimler);
        System.out.println("isimler.isEmpty() = " + isimler.isEmpty()); //true
        System.out.println("isimler.subList(1,2) = " + isimler.subList(0, 2));
        System.out.println("isimler.equals(\"Yasir\") = " + isimler.equals(isimler)); //Farklı list ile karşılaştırmak istedğimizde yazaibliriz.
        isimler.replaceAll(a -> a+"1");
        //ismi 1 ile bitenleri listele...
        isimler.replaceAll(a -> String.valueOf(a.endsWith("1")));  // ->
        System.out.println("isimler = " + isimler);

        /*
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add elements to the ArrayList
        languages.add("java");
        languages.add("javascript");
        languages.add("swift");
        languages.add("python");
        System.out.println("ArrayList: " + languages);

        // replace all elements to uppercase


        languages.replaceAll(e -> e.toUpperCase());

        System.out.println("Updated ArrayList: " + languages);;
         */

    }
}
