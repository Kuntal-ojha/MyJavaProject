package com.kuntal.ojha;
// Search an array using for-each style for.
public class C5_Control_Statements_31_Enhanced_For_Loop {
    public static void main(String[] args) {
        int nums[]={6,8,3,7,5,6,1,4};
        int val=5;
        boolean found=false;
        // Use for-each style for to search num for val
        for(int x:nums){
            if (x==val)
            {
                found=true;
                break;
            }
        }
        if(found)
            System.out.println("Value found!");
    }
}
