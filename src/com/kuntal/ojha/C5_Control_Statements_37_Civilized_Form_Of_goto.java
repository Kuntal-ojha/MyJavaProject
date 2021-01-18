package com.kuntal.ojha;
// Using break as a civilized form of goto
public class C5_Control_Statements_37_Civilized_Form_Of_goto {
    public static void main(String[] args) {
       boolean t=true;
       first:{
           second:{
                third:{
                    System.out.println("Before the break.");
                    if(t)
                        break second; // break out of second block
                    System.out.println("This won't execute");
              }
               System.out.println("This won't execute.");
           }
           System.out.println("This after second.");
       }
    }
}
