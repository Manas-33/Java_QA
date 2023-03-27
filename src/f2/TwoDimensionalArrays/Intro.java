package f2.TwoDimensionalArrays;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
//        int[][] arr=new int[3][4];
        Scanner s =new Scanner(System.in);
        System.out.print("Enter r: ");
        int r=s.nextInt();
        System.out.print("Enter c: ");
        int c=s.nextInt();

        int[][]arr=new int[r][c];

        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter the value of "+(i+1)+", "+(j+1)+" : ");
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("This is the 2d array: ");
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
