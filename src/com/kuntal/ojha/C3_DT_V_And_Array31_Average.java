package com.kuntal.ojha;
// Average an array of values.
public class C3_DT_V_And_Array31_Average {
    public static void main(String[] args) {
        double num[]={10.1,11.2,12.3,13.4,14.5};
        double result=0;
        int i;
        for(i=0;i<5;i++)
            result=result+num[i];
        System.out.println("\nAverage is "+ result/5);
    }
}
