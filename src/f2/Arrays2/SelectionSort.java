package f2.Arrays2;

public class SelectionSort {

    public static void printArray(int[] arr) {

        int n =arr.length;

        for (int j : arr) {
            System.out.println(j);
        }

    }

    public static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length;i++){

            int min=Integer.MAX_VALUE;
            int minIndex=-1;


            for(int j=i;j<arr.length;j++){

                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }

            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,6,4,8,0,3};

        selectionSort(arr);
        printArray(arr);

    }

}
