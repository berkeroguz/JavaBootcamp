package GrupCalismalari;

public class ConstructorSoru {
    String isim = "John Doe";
    int age = 25;
    public ConstructorSoru()
    {
        System.out.println("İsim = " + isim);
        isim="Yasir";
    }
    public ConstructorSoru(String isim,int age)
    {
        this.isim=isim;
        age=30;
    }
    public ConstructorSoru(String isim)
    {
        isim="Berker";
        age=age;
    }

    public static void main(String[] args) {
        ConstructorSoru ornek1 = new ConstructorSoru();
        ConstructorSoru ornek2 = new ConstructorSoru("İlhan",50);
        ConstructorSoru ornek3 = new ConstructorSoru("Hasan");

        System.out.println("İsim = " + ornek2.isim);
        System.out.println("İsim = " + ornek3.isim);
        System.out.println("Yaş = " + ornek2.age);

    }
}
