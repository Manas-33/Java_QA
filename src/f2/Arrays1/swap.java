package f2.Arrays1;

public class swap {
    public static void swapAlternate(int arr[]) {
        for (int i = 0; i < arr.length - 1; i+=2) {
            int temp =arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
        }
    }
}
