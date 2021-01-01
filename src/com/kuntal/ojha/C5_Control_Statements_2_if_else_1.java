package com.kuntal.ojha;
//  if(condition) statements1;
//  else statements2;
//  Demonstrate if-else-if statement
public class C5_Control_Statements_2_if_else_1 {
    public static void main(String[] args) {
      int month =4; // April
        String season;
        if (month==12 || month==1 || month==2)
            season ="Winter";
        else if (month==3 || month==4 || month==5)
            season ="Spring";
        else if (month==6 || month==7 || month==8)
            season ="Summer";
        else if (month==9 || month==10 ||month==11)
            season ="Autumn";
        else
            season ="Bogus Month";
        System.out.println("\nApril is in the "+ season+".");
    }
}
