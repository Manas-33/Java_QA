package f2.Arrays2;

public class BubbleSort {

    public static void printArray(int[] arr) {

        int n =arr.length;

        for (int j : arr) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[]arr) {

        for ( int i = 0 ; i < arr.length - 1 ; i++ ){

            for( int j = 0 ; j < arr.length- i - 1 ; j++ ){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr [j] = arr [j+1];
                    arr [j+1] = temp;


                }
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {1,6,4,8,0,3};

        printArray(arr);
        bubbleSort(arr);
        printArray(arr);

    }

}
