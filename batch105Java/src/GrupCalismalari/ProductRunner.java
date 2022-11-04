package GrupCalismalari;

public class ProductRunner {
    public static void main(String[] args) {
        Product urun = new Product(); //Parametresiz Constructor çalıştı.

        Product urun2 = new Product(1,"Telefon",1000,"Apple","CepTelefonu");

        System.out.println(urun2);


    }
}
