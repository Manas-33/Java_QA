package f1.lecture6;

import java.util.Scanner;

public class MirrorNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;

        while(i<=n){
            int space = 1;

            while(space<=(n-i)){
                System.out.print(" ");
                space=space+1;
            }

//            int j= 1;
//            int p=1;
//            while(j<=i){
//                System.out.print(p);
//                j=j+1;
//                p=p+1;
//            Could use j but is not necessary

            int p=1;
            while(p<=i){
                System.out.print(p);
                p=p+1;
            }



            System.out.println();
            i=i+1;
        }
    }
}
