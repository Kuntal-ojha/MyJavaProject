package com.kuntal.ojha;
// Demonstrate return.
public class C5_Control_Statements_42_Using_return {
    public static void main(String[] args) {
        boolean t=true;
        System.out.println("Before the return.");
        if(t)
            return; // return to caller
        System.out.println("This won't execution.");
    }
}
