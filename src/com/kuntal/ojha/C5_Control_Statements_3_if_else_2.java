package com.kuntal.ojha;

public class C5_Control_Statements_3_if_else_2 {
    public static void main(String[] args) {
        for (int month = 1; month <13 ; month++) {

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
            System.out.println("\nMonth "+month+" is in the "+ season+".");
        }

    }
}
