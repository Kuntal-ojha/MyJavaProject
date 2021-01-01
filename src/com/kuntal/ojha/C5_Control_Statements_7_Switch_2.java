package com.kuntal.ojha;

public class C5_Control_Statements_7_Switch_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            switch (i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i= "+i+" is less then 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i= "+i+" is less than 10");
                    break;
                default:
                    System.out.println("i= "+i+" is 10 or more");
            }
        }
    }
}
