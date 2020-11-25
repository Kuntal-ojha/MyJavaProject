// Question : 01
// Write a program to execute final Variable in Java.
package com.kuntal.ojha;

public class Final_Variable {
     int a=26; // final int a=26;
    void method ()
    {
        a=30;
    }

    public static void main(String[] args) {
        Final_Variable obj=new Final_Variable();
        obj.method();
    }
}
// OUTPUT OF THIS PROGRAM
// java: cannot assign a value to final variable a