package CyberSecurity;

import java.util.Scanner;

public class RSA {
    private static boolean coPrimeCheck(int a, int b){
        int temp;
        int ans;
        while(true){
            temp = a%b;
            if(temp == 0){
                ans = b;
                break;
            }
            a=b;
            b = temp;
        }

        return ans==1;
    }
    public static double gcd(double a, double h)
    {
        double temp;
        while (true) {
            temp = a % h;
            if (temp == 0)
                return h;
            a = h;
            h = temp;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter p: ");
        int p = s.nextInt();
        System.out.print("Enter q: ");
        int q = s.nextInt();

        int n = p*q;
        int tot = (p-1)*(q-1);
        int e = 0;
        for (int i = 2; i < tot; i++) {
            if(coPrimeCheck(i,tot)){
                e = i;
                break;
            }
        }
        System.out.println("The value of e is :"+e);
        int d = 0;
        while ((d * e) % tot != 1) {
            d++;
        }
        System.out.println("The value of d is :"+d);

        System.out.print("Enter m: ");
        int m = s.nextInt();
        int c = (((int) Math.pow(m,e)));
        System.out.println(c);
        c %=n;
        System.out.println("The value of c is :"+c);

        long m1 =  1;
        for (int i = 0; i < d; i++) {
            m1*=(long)c;
        }
        m1 = m1 % n;

        System.out.println("The value of m after c is :"+m1);
    }
}
