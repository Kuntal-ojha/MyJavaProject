package com.kuntal.ojha;

public class C3_DT_V_And_Array38_4D_Matrix {
    public static void main(String[] args) {
        int fourD[][][][]=new int [4][4][5][6];
        for (int i = 0; i <4; i++)
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 5; k++)
                    for (int l = 0; l < 6; l++)
                    fourD[i][j][k][l]=i*j*k*l;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++)
                        System.out.print(fourD[i][j][k][l]+" ");
                    System.out.println();
                    }
                System.out.println();
                }
            System.out.println();
        }
    }
}
