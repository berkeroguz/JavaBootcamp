package GrupCalismalari;

public class Day3_Calisma1 {
    public static void main(String[] args) {

        //primitive
      /*  int sayi1= 10;
        int sayi2= 20;
        sayi2=sayi1;
        sayi2=30;
        System.out.println(sayi1);
        */

        //non-primitive

        int [] sayilar1 = {1,2,3,4};
        int [] sayilar2 = {5,6,7,8};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[1]);
    }
}
