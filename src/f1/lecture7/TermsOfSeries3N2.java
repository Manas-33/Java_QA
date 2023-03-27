package f1.lecture7;

import java.util.Scanner;

public class TermsOfSeries3N2 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int count =0;
        int i=1;

        while (count<n){

            int term=(3*i)+2;
            i++;
            if(term%4!=0){
                System.out.print(term+" ");
                count++;
            }
        }
    }
}
