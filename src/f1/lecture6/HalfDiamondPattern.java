package f1.lecture6;

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int n1 = (n + 1) / 2;
        int n2 = n-n1;

        while(i<=n1){

            int s1 = 1;
            while(s1<=n1-i){
                System.out.print(" ");
                s1 = s1+1;
            }
            int st1 =1;
            while(st1<=2*i-1){
                System.out.print("*");
                st1 = st1 +1;
            }
            System.out.println();
            i=i+1;
        }

        i=1;
        while (i<=n2){

            int s2 = 1;
            while(s2<=i){
                System.out.print(" ");
                s2 = s2+1;
            }

            int st2 =1;
            while(st2<=n-2*i){
                System.out.print("*");
                st2= st2 +1;

            }
            System.out.println();
            i=i+1;
        }
    }
}
