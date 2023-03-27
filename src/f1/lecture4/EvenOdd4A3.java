package f1.lecture4;

import java.util.Scanner;

public class EvenOdd4A3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sumodd = 0;
        int sumeven = 0;
        int num = n;

        while (num != 0) {

            int remainder = num % 10;


            if (remainder % 2 == 0) {
                sumeven = sumeven + remainder;


            } if(remainder%2 != 0) {
                sumodd = sumodd +remainder;


            }
            num =num/10;
        }
        System.out.println(sumeven+" "+sumodd);
    }
}