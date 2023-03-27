package f1.lecture7;
import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        for (int i=1;i<=N;i++)
        {
            for (int j=N;j>=1;j--)
            {
                if (j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }

    }
}