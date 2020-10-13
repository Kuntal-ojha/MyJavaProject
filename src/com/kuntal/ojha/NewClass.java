package com.kuntal.ojha;

public class NewClass {
    public static void main(String[] args) {
        test1 st1 =new test1();
        test1 st2 =new test1();
        test1 st3 =new test1();
        test1 st4 =new test1();
        st1.show();
        st2.show();
        st3.show();
        st4.show();
    }
}
class test1
{
    int rol_no=0;
    void show()
    {
        System.out.println("New Student:Roll no:"+rol_no);
    }
}