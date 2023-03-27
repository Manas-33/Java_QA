package f2.Strings;

import java.util.Scanner;

public class MaximumOccurences {
    public static void printArray(int[] arr) {

        int n =arr.length;

        for (int j : arr) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        int[] arr= new int[256];
        int n= str.length();
        int max=0;

        for(int p =0;p<256;p++){
            arr[p]=0;
        }
        for (int i =0;i<n;i++){
            int c= str.charAt(i);
            arr[c]+=1;
            max=Math.max(max,arr[c]);
        }
        char ans='\0';
        for(int i=0;i<n;i++){
            int c= str.charAt(i);
            if(arr[c]==max){
                ans=str.charAt(i);
                break;
            }
        }
        System.out.println(ans);
    }

}
