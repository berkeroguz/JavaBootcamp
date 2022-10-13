package ders13_nastedForLoop_methodOlusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {


        /*
                 nested for loop kullanarak asagidaki sekli hazirlayin
        1
        2 4
        3 6 9
        4 8 12 16
        5 10 15 20 25
        5 10 15 20 25
        4 8 12 16
        3 6 9
        2 4
        1

         */
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i*j +" ");
            }
            System.out.println("");
        }
        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i*j +" ");
            }
            System.out.println("");
        }




    }
}
