package f2.Arrays2;

public class BinarySearch {
    public static int binarySearch(int[] arr,int x) {

        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(x>arr[m]){
                s=m+1;
            }else if(x<arr[m]){
                e=m-1;
            }else{
                return m;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int[] arr={1,4,6,10,20,35,40};
        int[] arr={1,4,7,10,20,35,40};
        int index= binarySearch(arr,7);
        System.out.println("Index is: "+ index);
    }
}
