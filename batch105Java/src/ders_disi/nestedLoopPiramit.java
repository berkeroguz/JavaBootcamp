package ders_disi;

public class nestedLoopPiramit {
    public static void main(String[] args) {

        // Soru : NestedLoop kullanarak şağıdaki şekli yazdırınız.
        //        //     1
        //        //    2 2
        //        //   3 3 3
        //        //  4 4 4 4
        //        // 5 5 5 5 5


        int sayi=5;

        for(int i=1;i<=sayi;i++)  //girdiğimiz sayıya kadar sayıları dolaşıyor
        {
            for(int b=i;b<=sayi;b++) //i kadar i'ye boşluk bırakıyor.
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) //i'yi yazdırır ve sağına bir boşluk koyar
            {
                    System.out.print(i+" ");
            }
            System.out.println(""); //i 'yi i kadar yazdırdıktan sonra bir alt satıra geçer.

        }

    }
}
