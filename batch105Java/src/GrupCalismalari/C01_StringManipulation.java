package GrupCalismalari;

import java.util.Locale;

public class C01_StringManipulation {
    public static void main(String[] args) {
        String str1 = "Jav çok güzeldir.a";
/*
        System.out.println(str1.toLowerCase()); //küçük harfe çevirir.
        System.out.println(str1.toUpperCase()); //büyük harfe çevirir.

        */
        String str2 ="JaVa";
        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str2)); //JAVA = Java = JaVa= java =
        System.out.println(str1.charAt(1)); // Girilen indeks numarasında bulunan char'ı getirir.
        System.out.println(str1.length()); // Karakter uzunluğu, bulunan karakter sayısı.
        //Girilen metin kullanıcıdan alınmış bir metin olabilir.
        System.out.println(str1.substring(str1.length()-1)); // Sonharfi yazdırabiliriz.

        System.out.println(str1.concat(" çok güzel").concat(" t105 ").concat(str2));

        System.out.println(str1.contains("java")); // false , büyükHarf küçük Harf duyarlı.

        System.out.println(str1.startsWith("Java")); //True
        System.out.println(str1.endsWith("dir.")); //True

        System.out.println(str1.indexOf("a",2)); //1
        System.out.println(str1.lastIndexOf("a")); //17

        System.out.println(str1.isEmpty());
        String str3="   ";
        System.out.println(str3.isEmpty()); //boşlukları saymaz.
        System.out.println(str3.isBlank()); // boşlukları da sayar.

        String str4=null;
        System.out.println(str4 + "java");

        String str5 ="Java Java Java güzeldir";
        System.out.println(str5.replace('a','4'));
        System.out.println(str5.replace("Java","ahmet"));





    }
}
