package f3.recursion2;

import java.util.Scanner;

public class QuickSort {
    public static int partition(int[] input, int s, int e) {
        int p=input[s];
        int count=0;
        for (int i = s+1; i <= e; i++) {
            if (input[i]<=p){
                count++;
            }
        }

        int pIndex=s+count;
        input[s]=input[pIndex];
        input[pIndex]=p;

        int i=s;
        int j=e;
        while (i<j){
            while (i<=e && input[i]<p){
                i++;
            }
            while (input[j]>p){
                j--;
            }
            if (i <= j) {
                int temp=input[i];
                input[i]=input[j];
                input[j]=temp;
                i++;
                j--;

            }
        }
        return pIndex;
    }

    public static void quickSort(int[] input, int s,int e) {
        if (s>=e){
            return;
        }
        int x=partition(input,s,e);
        quickSort(input,s,x-1);
        quickSort(input,x+1,e);
    }



    public static void quickSort(int[] input) {
        quickSort(input,0, input.length-1);
    }
    static Scanner s = new Scanner(System.in);
    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        QuickSort.quickSort(input);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
