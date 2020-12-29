package com.kuntal.ojha;
// Here i use Math.sqrt for square Root.
public class C3_DT_V_And_Array15_Square_Root {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int j= (int) Math.sqrt(i); // Here i use type of conversion double to int
            System.out.println(i+" Square Root "+j);
            double k=Math.sqrt(i);
            System.out.println(i+" Square Root "+k+"\n");
        }
    }
}
