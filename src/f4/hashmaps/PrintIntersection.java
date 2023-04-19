package f4.hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class PrintIntersection {
    public static void printIntersection(int[] arr1,int[] arr2){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int key: arr1) {
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        Arrays.sort(arr2);
        for (int key:arr2) {
            if(map.containsKey(key)){
                int noOf=map.get(key);
                while(noOf!=0){
                    System.out.println(key);
                    noOf--;
                }
                map.remove(key);
            }
        }
    }
}
