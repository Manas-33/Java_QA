package f1.lecture6;

import java.util.Scanner;

public class TriangleOfPatterns {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while(i<=n){
            int space =1;

            while(space<=(n-i)){
                System.out.print(" ");
                space =space+1;
            }
            int p =i;
            while(p<=2*i-1){
                System.out.print(p);
                p=p+1;
            }
            int d = 2*i-2;
            while (d >=i) {
                System.out.print(d);
                d=d-1;

            }
            System.out.println();
            i=i+1;
        }
    }
}
