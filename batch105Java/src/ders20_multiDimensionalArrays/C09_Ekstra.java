package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C09_Ekstra {
    public static void main(String[] args) {

        int [][][] arr = {{{1,2},{2,3}},{{2,3},{3,6}},{{3,5},{4,7}}};

        System.out.println(Arrays.toString(arr[1]));

        int [] sifirinciIndex = new int[6];

        for (int i =0 ; i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                for (int c=0;c<arr[i][j].length;c++)
                {
                    if (c==0)
                    {
                        System.out.print(arr[i][j][c]+" , ");
                    }
                    else System.out.println(arr[i][j][c]+" , ");
                }
            }
        }
    }
}
