package GrupCalismalari;

public class Product {
    //Özellikleri
    int id;
    String isim;
    double fiyat;
    String marka;
    String tur;

    //Klass ismiyle aynı olacak
    //Return type'i olmayacak.

    public Product (){
        System.out.println("Parametresiz Constructor çağırıldı.");
    }

    public Product(int id, String isim, double fiyat, String marka, String tur) {
        this.id = id;
        this.isim = isim;
        this.fiyat = fiyat;
        this.marka = marka;
        this.tur = tur;
    }

    public String toString() {
        return "Product{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", fiyat=" + fiyat +
                ", marka='" + marka + '\'' +
                ", tur='" + tur + '\'' +
                '}';
    }


}
