package ders10_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        String str = "Java heryerde güzel";

        System.out.println(str.endsWith("guzel")); //Güzel ile mi bitiyor ? True

        System.out.println(str.endsWith("")); // Hiçlik ile mi bitiyor? True

        System.out.println(str.endsWith("Java heryerde güzel")); // True

        System.out.println(str.endsWith("Java")); // False
    }
}
