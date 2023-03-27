package f1.lecture8;

import java.util.Scanner;

public class Function1 {
    public static int factorial(int num) {
        int fact =1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();

        int x=factorial(n);
        int y=factorial(r);
        int z=factorial((n-r));
        System.out.println(x/(y*z));

    }
}
