package f1.lecture7;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int reverse =0;

        while (n>0){
            int remainder =n%10;
            n=n/10;
            reverse=remainder+reverse;
            if (n>0){
               reverse=reverse*10;
            }
        }
        System.out.println(reverse);
    }
}
