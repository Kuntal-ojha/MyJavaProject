package com.kuntal.ojha;
// for(type itr-var:collection) statement-block
public class C5_Control_Statements_26_For_Each_Loop {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int x:nums)
        {
            sum+=x;
            System.out.println("Sum= "+sum);
        }
        System.out.println("\nSum= "+sum);
    }
}
