package f2.Arrays2;

public class BinarySearch {
    public static int binarySearch(int[] arr,int x) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(x>arr[mid]){
                start=mid+1;
            }else if(x<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,4,7,10,20,35,40};
        int index= binarySearch(arr,7);
        System.out.println("Index is: "+ index);
    }
}
