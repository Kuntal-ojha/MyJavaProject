package com.kuntal.ojha;

public class C3_DT_V_And_Array12_Array_1 {
    public static void main(String[] args) {
        int i,j;
        int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("April has "+month_days[3]+" days.");
        for (i=0;i<12;i++)
        {
             j=i;
            System.out.println("Month "+(j+1)+" and Days "+month_days[i]);
        }
    }
}
