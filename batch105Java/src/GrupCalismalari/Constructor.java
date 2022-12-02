package GrupCalismalari;

public class Constructor {
    private String isim = "Ali";
    private String soyisim = "Yücel";
    private static int yas = 30;
    public static int getYas() { //getter priavte olarak oluşturduğumuz değişkenin diğer classlar tarafından okunmasını sağlıyor.
        return yas;
    }
    public static void setYas(int yas) { //setter private olarak oluştrulan değişkene başka classlar tarafından ulaşılarak değişiklik yapmasını sağlar.
        Constructor.yas = yas;
    }
    public Constructor()
    {
        System.out.println("cr2 isim = "+isim + " cr2 yaş = " + yas);
    }
    public Constructor (String isim,int yas)
    {
        this.isim=isim;
        this.yas=yas;
    }
    public Constructor(String isim, String soyisim , int yas)
    {
        this.isim = isim;
        this.soyisim=soyisim;
        this.yas=yas;
    }

    public static void main(String[] args) {
        Constructor cr1 = new Constructor("Berker","Oguz",20);
        System.out.println("cr1.getYas() = " + cr1.getYas());
        Constructor cr2 = new Constructor();
        Constructor cr3 = new Constructor("İlhan",40);

        System.out.println("c1'in yası = "+ cr1.getYas());
        System.out.println("cr2 'nin yası = "+ cr2.getYas());
    }

}
