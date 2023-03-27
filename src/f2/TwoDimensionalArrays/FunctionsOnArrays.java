package f2.TwoDimensionalArrays;

import java.util.Scanner;

public class FunctionsOnArrays {
    public static int[][] takeInput() {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter r: ");
        int r=s.nextInt();
        System.out.print("Enter c: ");
        int c=s.nextInt();

        int[][]arr=new int[r][c];

        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter the value of ("+(i)+", "+(j)+") : ");
                arr[i][j]=s.nextInt();
            }
        }
        return arr;
    }

    public static void print2dArray(int[][]arr) {
        int rows =arr.length;
        int cols = arr[0].length;
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void  fun(int[][] arr2d)
    {

        for(int i=0;i<arr2d.length;i++)
        {
            for(int j=0;j<arr2d[i].length;j++)
            {
                arr2d[i][j]=2*i+j;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        fun(arr);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(arr[i][j]+" " );
            }
        }
    }
}
