package f2.TwoDimensionalArrays;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LargestColumn {

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

    public static void main(String[] args) {

    }
}
