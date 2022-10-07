package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C09_Alistirma {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Lütfen bulunduğunuz konumu giriniz");

        String gidisguzergahi = scan.nextLine();

        int istanbul = 1001;


        System.out.println("Lütfen gideceğiniz konumu giriniz");

        int aybasti = 1;

        String donusguzergahi = scan.nextLine();


        System.out.println("\n Konum : " + gidisguzergahi +
                "\n Varış Noktası : " + donusguzergahi);


        System.out.println("\n Gidiş  mesafesi : " + (istanbul - (aybasti)));

        // saatte 90 kilometre hızla gittiği düşünülmüştür.

        System.out.println("Gidiş dönüş mesafesi : " + (istanbul - (aybasti)) * 2);

        int hiz = 90;


        System.out.println("\n Ortalama Süre : " + (float) ((istanbul - (aybasti))) / hiz);

        double ortalamasure = scan.nextDouble();
    }

}
