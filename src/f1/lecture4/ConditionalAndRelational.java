package f1.lecture4;

import java.util.Scanner;

public class ConditionalAndRelational {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();
//
//        if ((a>0)||(b>0)) {
//            System.out.println("one is positive");
//        } else {
//            System.out.println("none is positive");
//        }

        if (a==b) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

//        System.out.println("The value of a is "+ a );
//        System.out.println("The value of b is "+ b );

    }
}