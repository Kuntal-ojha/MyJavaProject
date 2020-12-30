package com.kuntal.ojha;
// Demonstrate several assignment operator
public class C4_Operators_3_Op_Equals {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        a+=5; // a=1+5=6
        b*=4; // b=2*4=8
        c+=a*c; // c=c+a*c=3+6*3=6+18=21
        System.out.println("c = "+c);
        c%=6; // c=21%6=3
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}
