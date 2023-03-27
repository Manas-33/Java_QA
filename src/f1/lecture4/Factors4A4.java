package f1.lecture4;

import java.util.Scanner;

public class Factors4A4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;

        while (i<n) {
            if (n%i==0) {
                System.out.print(i + " ");
            }
            i=i+1;
        }
    }
}