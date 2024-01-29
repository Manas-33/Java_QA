package f2.Arrays2;

public class LinearSearch {
    public static int linearSearch(int[] arr,int x) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,4,7,10,20,35,40};
        int index= linearSearch(arr,7);
        System.out.println("Index is: "+ index);
    }
}
