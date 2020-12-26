package com.kuntal.ojha;
// This program will not compile
public class C3_DT_V_And_Array9 {
    public static void main(String[] args) {
        int bar=1;
        {               // creates a new scope.
            //int bar=2;  // Compile-time error-bar already defined!
        }
    }
}
