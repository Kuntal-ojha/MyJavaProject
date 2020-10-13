package com.kuntal.ojha;

public class NewClass1 {
    public static void main(String[] args) {
        test2 st1 =new test2();
        test2 st2 =new test2();
        test2 st3 =new test2();
        test2 st4 =new test2();

        st1.show();
        st2.show();
        st3.show();
        st4.show();
    }
}
class test2
{
    int rol_no=0;
    test2()
    {
        rol_no++;
    }
    void show()
    {
        System.out.println("New Student:Roll no:"+rol_no);
    }
}