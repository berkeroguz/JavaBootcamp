package ders11_stringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {

        String str="Java güzeldir ";

        System.out.println(str.repeat(4)); // 4 kere java güzeldir yazar

        str="             Java güzeldir      ";
        System.out.println(str.length()); //19

        str=str.trim(); // Başındaki, ve sonundaki boşlukları siler.

        System.out.println(str);
        System.out.println(str.length());

    }
}
