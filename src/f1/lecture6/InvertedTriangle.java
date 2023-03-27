package f1.lecture6;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i= 1;

        while(i<=n){

            int j = 1;

            while(j<=(n+1-i)){

                System.out.print("*");
                j=j+1;

            }
            System.out.println(" ");
            i=i+1;

        }
    }

}
