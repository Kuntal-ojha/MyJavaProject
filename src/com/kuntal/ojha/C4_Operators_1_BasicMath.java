package com.kuntal.ojha;
// Demonstrate the basic arithmetic operator.
public class C4_Operators_1_BasicMath {
    public static void main(String[] args) {
        // arithmetic using integers
        System.out.println("\nInteger Arithmetic.");
        int a=1+1; // a=2
        int b=a*3; // b=6
        int c=b/4; // c=1
        int d=c-a; // d=1-2=-1
        int e=-d;  // e=-(-1)=1
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        System.out.println("d= "+d);
        System.out.println("e= "+e);

        // Arithmetic using doubles
        System.out.println("\nFloating Point Arithmetic");
        double da=1+1;  // da=2.0 Because of double
        double db=da*3; // db=6.0
        double dc=db/4; // dc=6.0/4=1.5
        double dd=dc-a; // dd=1.5-2=-0.5
        double de=-dd;  // de=-(-0.5)=0.5
        System.out.println("da= "+da);
        System.out.println("db= "+db);
        System.out.println("dc= "+dc);
        System.out.println("dd= "+dd);
        System.out.println("de= "+de);
    }
}
