package com.kuntal.ojha;

public class Basic_Object {
    public static void main(String[] args) {
        // Student s1 = new Studentstudent();
        Student s1; // Ref of object of class Student;
        s1= new Student();
        s1.disp();

    }

}
class Student
{
    String name;
    int rol_no;

    Student()
    {
        name="Name is Missing";
    }
    void disp()
    {
        System.out.println(name);
        System.out.println(rol_no);
    }
}