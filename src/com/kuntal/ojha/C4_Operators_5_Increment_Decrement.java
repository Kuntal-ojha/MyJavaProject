package com.kuntal.ojha;

public class C4_Operators_5_Increment_Decrement {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c;
        int d;
        c=++b; // b=b+1; b=3; c=b; c=3
        d=a++; // a=1; d=a; d=1; a=a+1; a=2;
        c++; // c=c+1; c=3+1=4
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
}
