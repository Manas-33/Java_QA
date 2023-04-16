package f4.hashmaps;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Boolean>map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]+1==arr[i+1]){
                map.put(2,true);
            }
        }
        return new ArrayList<>();
    }
}
