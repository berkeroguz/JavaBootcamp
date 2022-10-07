package ders03_datacastingWrapperClass;

public class Alistma {
    public static void main(String[] args) {
        int a=3, b=5 , c;
        c= (a* ++b) / (5-12) * (a+b); // integer olduğu için -2,5.. küsüratı atar -2 yapar.
        System.out.println(c);
    }
}
