package f1.lecture4;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int i = 1;//NEXT NUMBER TO BE ADDED
        int sum = 0;
        while (i<=n) {
            sum = sum +i;
            i = i+1;

        }
        System.out.println("The sum is "+sum);
    }
}
