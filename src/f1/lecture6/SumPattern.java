package f1.lecture6;
import java.util.Scanner;
public class SumPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++){
            sum=0;
            for(int j=1;j<=i;j++){
                sum=sum+j;
                System.out.print(j);
                if(j<i)
                    System.out.print("+");
            }System.out.println("=" + sum);
        }
    }
}
