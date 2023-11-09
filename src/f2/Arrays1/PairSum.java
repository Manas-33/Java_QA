package f2.Arrays1;

import java.util.HashMap;

public class PairSum {
    public static int pairSum(int arr[], int x) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i = 0; i<arr.length;i++){
            int item  = arr[i];
            if(map.containsKey(x-item)){
                int total=map.get(x-item);
                count+=total;
            }
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return count;
    }
}
