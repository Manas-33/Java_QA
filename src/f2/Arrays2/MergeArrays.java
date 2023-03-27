package f2.Arrays2;

public class MergeArrays {

    public static void printArray(int[] arr) {

        int n =arr.length;

        for (int j : arr) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    public static int[] mergeArrays(int[]arr1,int[]arr2) {

        int n1=arr1.length;
        int n2=arr2.length;
        int[] arr= new int[n1+n2];
        int i=0,j=0,k=0;

        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }else{
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,6,4,8,0,3};
        int[] arr2 = {1,3,4,7,11};
        int[] arr3 = new int[arr1.length+ arr2.length];
        printArray(arr1);
        printArray(arr2);
        arr3=mergeArrays(arr1,arr2);
        printArray(arr3);

    }
}
