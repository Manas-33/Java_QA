package f1.lecture6;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int space1 = 1;

            while (space1 <= (n - i)) {
                System.out.print(" ");
                space1 = space1 + 1;
            }


            int p = 1;
            while (p <= i) {
                System.out.print(p);
                p = p + 1;
            }
            int dec = i-1;
            while (dec >=1) {
                System.out.print(dec);
                dec=dec-1;

            }

            System.out.println();
            i = i + 1;
        }
    }
}
