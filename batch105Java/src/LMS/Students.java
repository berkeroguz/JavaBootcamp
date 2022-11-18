package LMS;

public class Students extends Person {
    //Eğer ki sayısal veri de olsa, o veride matematiksel işlem yapılmayacksa string olarak tanımlanır.

   private String ogrenciNo;

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

}
