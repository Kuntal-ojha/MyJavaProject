package com.kuntal.ojha;

public class C4_Operators_4_Increment_Decrement {
    public static void main(String[] args) {
        int x,y;
        x=42;
        y=++x;
        /*
        * In this case,y is set to 43 as you would expect, because the
        * increment occurs before x is assigned to y. Thus, the line
        * y=++x;
        * is the equivalent of these two statements.
        * x=x+1;
        * y=x;
        */
        System.out.println("x=42;\n" +
                "y=++x;");
        System.out.println("x = "+x+" y = "+y+"\n");
        x=42;
        y=x++;
        /*
        * The value of x is obtained before the increment operator is execute, so the
        * value of y is 42. Of course, in both cases x is set to 43. Here, the line
        * y=x++;
        * is the equivalent of these two statement.
        * y=x;
        * x=x+1;
        */
        System.out.println("x=42;\n" +
                "y=x++;");
        System.out.println("x = "+x+" y = "+y);
    }
}
