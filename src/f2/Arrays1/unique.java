package f2.Arrays1;

import java.util.Arrays;
import java.util.HashMap;

public class unique {
    public static int findUnique(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
    public static int duplicateNumber(int arr[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int item =arr[i];
            if(map.containsKey(item)){
                return item;
            }else{
                map.put(item,1);
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int pairSum(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            int j;
            for (j =i+1; j < arr.length; j++) {
                    if (elem + arr[j] == x) {
                        count++;
                    }
                }

        }
        return count;
    }
    public static void sortZeroesAndOne(int[] arr){
        int nextZero=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                int temp = arr[i];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                nextZero++;
            }
        }
    }

}
