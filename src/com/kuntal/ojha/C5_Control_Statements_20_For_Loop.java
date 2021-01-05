package com.kuntal.ojha;
// Test for primes
public class C5_Control_Statements_20_For_Loop {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num=14;
        if (num<2)
            isPrime=false;
        else isPrime=true;
        for (int i = 2; i < num/i; i++) {
            if ((num%i)==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Prime.");
        else System.out.println("Not Prime.");
    }
}
