package com.kuntal.ojha;
// Live coding Day 01 Toeplitz Matrix
// Website of this question:
//Q:01 Toeplitz Matrix
//https://leetcode.com/problems/toeplitz-matrix/
/**
 * Given a nxm matrix, I want to find whether it is Toeplitz Matrix or not
*/

public class LC_Day_01_Toeplitz_Matrix {
    public boolean isToeplitzMatrix(int[][] matrix){
        for(int row=0;row<matrix.length-1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                if (matrix[row][col] != matrix[row + 1][col + 1])
                    return false;
            }
        }
            return true;
    }
    public static void print2DMatrix(int[][] matrix){
        System.out.println("\nTest matrix: \n");
        for (int[] row: matrix) {
            for (int valInRaw : row) {
                System.out.print(valInRaw+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LC_Day_01_Toeplitz_Matrix toeplitz_matrix = new LC_Day_01_Toeplitz_Matrix();
        int[][] testcase1={{1,2,3},{4,5,6},{7,8,9}};
        print2DMatrix(testcase1);
        System.out.println("\nIs Testcase1 Matrix a Toeplitz :" + toeplitz_matrix.isToeplitzMatrix(testcase1));
        int[][] testcase2={{1,2,3,4},{5,1,2,3,},{9,5,1,2}};
        print2DMatrix(testcase2);
        System.out.println("\nIs Testcase2 Matrix a Toeplitz :" + toeplitz_matrix.isToeplitzMatrix(testcase2));
    }
}
