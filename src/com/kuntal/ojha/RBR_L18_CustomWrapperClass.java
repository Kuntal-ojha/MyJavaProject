package com.kuntal.ojha;

class MyInteger{
    private int i;
    // constructor
    MyInteger(int j){
        i=j;
    }
    // Public api
    public int intvalue(){
        return i;
    }
}
public class RBR_L18_CustomWrapperClass {
    public static void main(String[] args) {
        int x=10;
        // java defined wrapper classes
        Integer y= new Integer(x);
        System.out.println(y.intValue());
        //Using the custom wrapper class to create a wrapper class
        MyInteger z= new MyInteger(x);
        System.out.println(z.intvalue());
    }

}
