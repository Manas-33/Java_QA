package f1.lecture4;

import java.util.Scanner;

public class LargestOfTwo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a, b;

        a = s.nextInt();
        b = s.nextInt();



        if (a > b) {
            System.out.println("First number is greater ");
        }
        else if (b > a) {
            System.out.println("Second number is greater");
        }
        else {
            System.out.println("Both are equal");
        }

//        TYPES OF IF ELSE IF ELSE
//          1) if
//          2) if else
//          3) if >else if > else if.....>else
//          4) if >else if > else if.....



//        if (a > b) {
//            System.out.println("First number is greater ");
//        }
//        if (b > a) {
//            System.out.println("Second number is greater");
//        }
//        if (a == b) {
//            System.out.println("Both are equal");
//        }




//        if (a > b) {
//            System.out.println("First number is greater ");
//        }if (b > a) {
//                System.out.println("Second number is greater");
//            } else {
//                System.out.println("Both are equal");




//        if (a > b) {
//            System.out.println("First number is greater ");
//        } else {
//            if (b > a) {
//                System.out.println("Second number is greater");
//            } else {
//                System.out.println("Both are equal");

//        System.out.println("outside if else");



    }
}