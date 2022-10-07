package ders11_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1 = "";

        System.out.println(str1); //hiclik yazdırır

        System.out.println(str1.concat("Java")); //Java

        String str2;
        // System.out.println(str2);// değer atanmamış stringe kızıyor.
       // System.out.println(str2.concat("Java")); buna da kızar.

        str2= "Java candir";
        System.out.println(str2);
        System.out.println(str2.concat("."));
        //Concat ekleme metodur. String'e ekler.

        String str3=null; //str3'e değer atanmamıştır
        // Null pointer ile javaya değer atamadığmıızın farkında oldugumuzu söylüyoruz
        System.out.println(str3);

        //System.out.println(str3.concat("Java")); //Hata verir.

        System.out.println(str3 + "java"); //nullJava

    }
}
