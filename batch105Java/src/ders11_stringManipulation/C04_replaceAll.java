package ders11_stringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {

        // Kullanıcının girdiği metinde
        // harf dısında kalan tüm karakterleri temizleyen bir kod yazınız.
        // NOT : space silinmemeli.

        String input="Ja5+va cok 1*guzel";

        input = input.replaceAll("\\d",""); // Ja+va cok *guzel
        input=input.replaceAll(" ","5"); // Ja+va5cok5*guzel
        input=input.replaceAll("\\W",""); //Java5cok5guzel
        input=input.replace("5"," ");
        System.out.println(input);

    }
}
