package f2.Arrays1;

public class Arrange {
    public static void arrange(int[] arr, int n) {
        int start =0;

        for(int i=1;i<=n;i+=2){
            arr[start]=i;
            start++;
        }

        int end=0;
        if(n%2==0) end=n;
        else end=n-1;

        for(;end>=2;end-=2){
            arr[start]=end;
            start++;
        }
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void arrange2(int[] arr, int n) {
        int start=0;
        int end=n-1;
        int counter=1;

        while(start<=end){
            if(counter%2==1){
                arr[start]=counter;
                counter+=1;
                start+=1;
            }else{
                arr[end]=counter;
                counter+=1;
                end-=1;
            }
        }
    }

    public static void main(String[] args) {
        int n;
        n=10;
        int[] arr = new int[n];
        arrange(arr,n);
    }
}
