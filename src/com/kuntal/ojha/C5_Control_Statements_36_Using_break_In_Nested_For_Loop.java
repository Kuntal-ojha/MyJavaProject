package com.kuntal.ojha;
// Using break with nested for loop
public class C5_Control_Statements_36_Using_break_In_Nested_For_Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass "+i+": ");
            for (int j = 0; j < 100; j++) {
                if (j==10)
                    break; // Terminate loop if j is 10
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Loops Complete.");
    }
}
