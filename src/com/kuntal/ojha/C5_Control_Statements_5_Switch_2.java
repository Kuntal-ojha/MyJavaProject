package com.kuntal.ojha;

public class C5_Control_Statements_5_Switch_2 {
    public static void main(String[] args) {
        for(int i=0;i<=8;i++){
            switch (i){
                case 1:
                    System.out.println("I am in Case:1 "+i);
                case 2:
                    System.out.println("I am in Case:2 "+i);
                case 3:
                    System.out.println("I am in Case:3 "+i);
                case 4:
                    System.out.println("I am in Case:4 "+i);
                    break;
                case 5:
                    System.out.println("I am in Case:5 "+i);
                case 6:
                    System.out.println("I am in Case:6 "+i);
                case 7:
                    System.out.println("I am in Case:7 "+i);
                case 8:
                    System.out.println("I am in Case:8 "+i);
                default:
                    System.out.println("I am in default "+i);
            }
        }

    }
}
