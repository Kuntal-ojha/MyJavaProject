package com.kuntal.ojha;

public class Palindrome {
        public static void main(String[] args) {
            int n=121, r=0,rem, original;
            original=n;
            while (n!=0)
            {
                rem=n%10;
                r=r*10+rem;
                n=n/10;
            }
            if (original==r)
            {
                System.out.println("Number is palindrome");
            }
            else {
                System.out.println("Number is not palindrome");
            }
        }
}
