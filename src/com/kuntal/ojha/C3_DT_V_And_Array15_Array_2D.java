package com.kuntal.ojha;
// Demonstrate a twe-dimensional array.
public class C3_DT_V_And_Array15_Array_2D {
    public static void main(String[] args) {
        int TwoDArray[][]=new int [4][5];
        int i,j,k=0;
        for ( i = 0; i <4 ; i++)
            for ( j = 0; j <5 ; j++) {
                TwoDArray[i][j]=k;
                System.out.println("K="+k);
                k++;
            }
            for ( i = 0; i <4 ; i++) {
                for (j = 0; j < 5; j++)
                    System.out.print(TwoDArray[i][j] + " ");
                System.out.println();
        }
    }
}
