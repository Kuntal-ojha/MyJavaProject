package com.kuntal.ojha;
// Demonstrate block scope
public class C3_DT_V_And_Array7 {
    public static void main(String[] args) {
        int x; // Known to all code within main
        x=10;
        if (x==10){ // Start a new scope
            int y=20; // Known only to this book
            // x and y both known here.
            System.out.println("x and y: "+ x + " and " + y );
            x=y*2;
        }
        // y=100; // Error ! y not known here

        // x is still known here.
        System.out.println("x is: "+ x);
    }
}
