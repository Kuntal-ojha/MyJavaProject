package com.kuntal.ojha;
// Loop may be Nested.
public class C5_Control_Statements_33_Nested_For_Loop {
    public static void main(String[] args) {
        System.out.println("\nThis output produced by the program is shown here:");
        int i,j;
        for ( i = 0; i < 10; i++) {
            for ( j = i; j <10 ; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
