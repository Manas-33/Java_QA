package f1.lecture4;

import java.util.Scanner;

public class PowerOfANumber4A5 {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int p=1;
        for(int i=1;i<=n;i++)
        {
            p=p*x;
        }
        System.out.println(p);

    }


}
