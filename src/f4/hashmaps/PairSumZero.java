package f4.hashmaps;

import java.util.HashMap;

public class PairSumZero {
    public static int PairSum(int[] input, int size) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int key:input) {
            if (map.containsKey(key)) {
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }

        int totalPairs=0;
        for (Integer i: map.keySet()) {
            if(map.containsKey(-i) && i!=0){
                totalPairs+=map.get(i)*map.get(-i);
            }
        }
        totalPairs/=2;
        if (map.containsKey(0)) {
            int noOfZeroes=map.get(0);
            totalPairs+=(noOfZeroes*(noOfZeroes-1))/2;
        }
        return totalPairs;
    }
}
