package com.kuntal.ojha;
// Part of the for loop can be empty.
public class C5_Control_Statements_23_For_Loop {
    public static void main(String[] args) {
        int i;
        boolean done=false;
        i=0;
        for(;!done;){
            System.out.println("i is "+i);
            if (i==0)
               done=true;
            i++;
        }
    }
}
