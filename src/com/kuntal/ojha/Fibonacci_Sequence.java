package com.kuntal.ojha;

public class Fibonacci_Sequence {
    public static void main(String[] args) {
        int i,a=0,b=1,c;
        for (i=0;i<10;i++){
            System.out.println("Fibonacci Sequence is :"+a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
