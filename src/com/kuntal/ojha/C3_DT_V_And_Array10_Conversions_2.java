package com.kuntal.ojha;

public class C3_DT_V_And_Array10_Conversions_2 {
    public static void main(String[] args) {
        byte b;
       // double d=323.142;
        for (double i=0.142;i<323.142;i++)
        {
            // Conversion of double to byte.
            System.out.println("\nConversion of double to byte.");
            b=(byte) i;
            System.out.println("d and b "+ i +" double to byte " + b);
        }
    }
}
