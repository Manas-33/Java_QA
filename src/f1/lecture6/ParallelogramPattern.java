package f1.lecture6;

import java.util.Scanner;

public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int i =1;

        while(i<=n){

            int s1=1;
            while(s1<=i-1){
                System.out.print(" ");
                s1=s1+1;
            }
            int j=1;
            while (j<=n){
                System.out.print("*");
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
