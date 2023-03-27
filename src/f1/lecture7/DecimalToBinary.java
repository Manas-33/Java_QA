package f1.lecture7;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        long b=0, p=1;
        while(n>0){
            int r=n%2;
            b=b+r*p;
            p=p*10;
            n=n/2;
        }
        System.out.println(b);
    }
}
