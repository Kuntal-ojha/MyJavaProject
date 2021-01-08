package com.kuntal.ojha;
// Use break with a for-each style for.
public class C5_Control_Statements_28_For_Each_Loop {
    public static void main(String[] args) {
        int sum=0;
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        // use for to display and sum the values
        for (int x:nums) {
            System.out.println("Values is:" + x);
            sum += x;
            if (x == 5)
                break; // Stop the loop when 5 is obtained .
        }
        System.out.println("Summation of first 5 elements:"+sum);
    }
}
