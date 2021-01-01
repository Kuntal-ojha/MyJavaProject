package com.kuntal.ojha;
// A simple example of the switch.
public class C5_Control_Statements_3_Switch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i)
            {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                case 2:
                    System.out.println("i is two.");
                    break;
                case 3:
                    System.out.println("I is three.");
                    break;
                default:
                    System.out.println("i is greater than 3.");
            }
        }
    }
}
