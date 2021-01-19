package com.kuntal.ojha;
// Demonstrate continue.
public class C5_Control_Statements_40_Using_continue {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.print(i+" ");
            if (i%2==0)
                continue;
            System.out.println();
        }
    }
}
