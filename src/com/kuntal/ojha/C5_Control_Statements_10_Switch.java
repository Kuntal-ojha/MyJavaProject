package com.kuntal.ojha;
// Nested switch statement
public class C5_Control_Statements_10_Switch {
    public static void main(String[] args) {
        int count =1,target=0,go=1;
        switch (count){
            case 1:
                switch (target){
                    case 0:
                        System.out.println("target is zero");
                        break;
                    case 1:
                        System.out.println("target is one");
                        break;
                }
            case 2:
                switch (go){
                    case 0:
                        System.out.println("Kuntal Ojha");
                        break;
                    case 1:
                        System.out.println("Welcome !");
                        break;
                }
        }
    }
}
