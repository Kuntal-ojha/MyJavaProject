package com.kuntal.ojha;

public class C3_DT_V_And_Array25_Automatic_Conversions_4 {
    public static void main(String[] args) {
        byte a=40;
        byte b=50;
        byte c=100;
        int d=a*b/c; // Here byte automatically convert int.
        System.out.println(d);
    }
}
