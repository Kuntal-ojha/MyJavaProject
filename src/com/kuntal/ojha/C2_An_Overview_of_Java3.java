package kuntal.ojha;
/*
* Demonstrate the if
* Call this file "C2_An_Overview_of_Java3".
*/
public class C2_An_Overview_of_Java3 {
    public static void main(String[] args) {
        int x,y;
        x=10;
        y=20;
        if(x<y)
            System.out.println("x is less then y.");
            x=x*2;
            if (x==y)
                System.out.println("x now equal to y.");
                x=x*2;
                if (x>y)
                    System.out.println("x now greater then y.");
                // this won't display anythings
                    if (x==y)
                        System.out.println("you won't see this.");
    }
}
