package com.kuntal.ojha;
// Demonstrate casts.
public class C3_DT_V_And_Array10_Conversions {
    public static void main(String[] args) {
        byte b;
        int i=257;
        double d=323.142;
        System.out.println("\nConversion of int to byte.");
        b=(byte) i;
        System.out.println("i and b "+ i + " int to byte " + b);
        System.out.println("\nConversion of double to int.");
        i=(int) d;
        System.out.println("d and i "+ d + " double to int "  + i);
        System.out.println("\nConversion of double to byte.");
        b=(byte) d;
        System.out.println("d and b "+ d +" double to byte " + b);
    }
}
