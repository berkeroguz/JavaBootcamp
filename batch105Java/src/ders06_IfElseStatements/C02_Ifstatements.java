package ders06_IfElseStatements;

import java.util.Scanner;

public class C02_Ifstatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üçgen kenar uzunluklarını giriniz.");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        if (a==b && b==c)
        {
            System.out.println("Eşkanar üçgendir.");
        }
        else {
            System.out.println("Eşkenar üçgen değildir.");
        }

    }
}
