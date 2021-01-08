package com.kuntal.ojha;
// The for-each loop is essentially read-only.
public class C5_Control_Statements_29_For_Each_Loop {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        for (int x:nums){
            System.out.print(x+" ");
            x=x*10; // no effect on nums
        }
        System.out.println();
        for (int x:nums){
            System.out.print(x+" ");
        }
      //  System.out.println();
    }
}
