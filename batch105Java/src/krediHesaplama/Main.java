package krediHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen hesaplanması gereken tutarı giriniz.");
        double input = scan.nextDouble();

        BaseKrediRunner kredi;
        while (true)
        {
            System.out.println("Lütfen kredi türünüzü seçiniz.");
            System.out.println("1 - Askeri kredi için 1'e basınız");
            System.out.println("2 - Öğrenci kredisi için 2'e basınız");
            System.out.println("3 - Konut kredisi için 3'e basınız");
            int krediTuru = scan.nextInt();
            if (krediTuru ==1)
            {
                kredi = new AskeriKrediRunner();
                break;
            }
            else if (krediTuru == 2)
            {
                kredi = new OgrenciKrediRunner();
                break;
            }
            else if (krediTuru == 3)
            {
                kredi = new KonutKrediRunner();
                break;
            }
            else {
                System.out.println("Lütfen belirtilmiş girişleri kullanınız.");
            }
        }
        kredi.hesapla(input);





    }

}