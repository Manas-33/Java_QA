package f1.lecture4;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int div = 2;
//        boolean isPrime = true;
        while (div <= n/2) {

            if (n % div == 0) {
//                System.out.println(div+" "+"The number is COMPOSITE");
                System.out.println(div+" "+"The number is COMPOSITE");
//                isPrime = false;
                return;
            }
            div = div + 1;
        }
        System.out.println("The number is PRIME");

//        if (isPrime == true) {
//            System.out.println("The number is PRIME");
//        } else {
//            System.out.println("The number is COMPOSITE");
//        }
    }
}
