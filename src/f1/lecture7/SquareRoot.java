package f1.lecture7;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n == 0) {
            System.out.println("0");
        }else{
            int ans=0;
            while(ans*ans<=n){
                ans++;
            }
            ans--;
            System.out.println(ans);
        }

    }
}