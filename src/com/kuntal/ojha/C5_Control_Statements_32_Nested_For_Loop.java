package com.kuntal.ojha;
// Loops may be nested.
public class C5_Control_Statements_32_Nested_For_Loop {
    public static void main(String[] args) {
        int i,j;
        for ( i = 0; i < 10; i++) {
            for ( j = i; j <10 ; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}
