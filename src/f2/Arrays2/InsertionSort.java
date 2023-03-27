package f2.Arrays2;

public class InsertionSort {

    public static void printArray(int[] arr) {

        int n =arr.length;

        for (int j : arr) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length;i++){
            int temp=arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,6,4,8,0,3};

        printArray(arr);
        insertionSort(arr);
        printArray(arr);

    }

}
