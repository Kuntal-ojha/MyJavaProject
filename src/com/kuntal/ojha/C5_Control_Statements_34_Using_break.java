package com.kuntal.ojha;
// Using break to exit a loop
public class C5_Control_Statements_34_Using_break {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i==10)
                break; // terminate loop if i is 10
            System.out.println("i: "+i);
        }
        System.out.println("Loop complete.");
    }
}
