package com.kuntal.ojha;
// Demonstrate lifetime of a variable.
public class C3_DT_V_And_Array18 {
    public static void main(String[] args) {
        int x;
        for (x=0;x<5;x++) {
            int y=-1; // Y is initialize each time block element.
            System.out.println("y is: "+ y); // This allays prints -1
            y=100;
            System.out.println("y is now: "+y); // This allays print 100
        }
    }
}
