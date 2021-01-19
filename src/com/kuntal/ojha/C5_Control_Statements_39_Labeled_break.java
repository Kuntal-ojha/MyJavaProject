package com.kuntal.ojha;
// This program contains an error
public class C5_Control_Statements_39_Labeled_break {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.println("Pass "+i+": ");
        }
        for (int j = 0; j < 100; j++) {
            if (j==10)
              //  break one;  // wrong we can't write break one;
                System.out.println(j+" ");
        }
    }
}
