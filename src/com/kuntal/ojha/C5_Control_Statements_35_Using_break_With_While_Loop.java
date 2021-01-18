package com.kuntal.ojha;
// Using break to exit a while loop
public class C5_Control_Statements_35_Using_break_With_While_Loop {
    public static void main(String[] args) {
        int i=0;
        while (i<100){
            if(i==10)
                break;
            System.out.println("i: "+i);
            i++;
        }
        System.out.println("Loop complete.");
    }
}
