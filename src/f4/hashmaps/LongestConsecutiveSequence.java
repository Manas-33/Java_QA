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
            if(i+1<arr.length){
                if(arr[i]+1==arr[i+1]){
                    map.put(2,true);
                }
            }

        }
        ArrayList<Integer> keysList = new ArrayList<>(map.keySet());
        return keysList;
    }

    public static void main(String[] args) {
        int[] arr ={49, 1, 3, 200, 2, 4, 70, 5};
        ArrayList<Integer>result=longestConsecutiveIncreasingSequence(arr);
        for (Integer i:
             result) {
            System.out.println(result);
        }
    }
}
