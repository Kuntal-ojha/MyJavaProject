package com.kuntal.ojha;

public class C3_DT_V_And_Array26_Conversions{
    public static void main(String[] args) {
        byte b=50;
        // b=b*2; // Error ! Cannot assign an int to a byte !
        // This is the right way.
        b=(byte) (b*2);
        System.out.println(b);
    }
}
