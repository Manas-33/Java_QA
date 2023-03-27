package f1.lecture7;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=s.nextInt();
        int answer =1;

        switch (c){

            case 1:
                for(int i=2;i<=n;i++){
                    answer=answer+i;
                }
                break;

            case 2:
                for (int i=2;i<=n;i++){
                    answer=answer*i;
                }
                break;

            default:
                answer=-1;
                break;

        }
        System.out.println(answer);
    }
}
