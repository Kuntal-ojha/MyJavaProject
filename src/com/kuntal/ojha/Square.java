package com.kuntal.ojha;
// Question: if 9^(n+2)=240+9^n then find the value of n ?
public class Square {
    public static void main(String[] args) {
        double square,square1;
        for (double i=0;i<100;i=i+.1) {
            double j=i;
            square=Math.pow(9,(i));
            square1=Math.pow(9,(j+2));
            if (square1==(square+240))
            {
                System.out.println(i);
            }
        }

    }
}
