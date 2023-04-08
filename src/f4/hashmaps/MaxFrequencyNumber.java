package f4.hashmaps;

import java.util.HashMap;

public class MaxFrequencyNumber {

    public static int maxFrequencyNumber(int[] arr){

        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int x=arr[i];
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        int max=Integer.MIN_VALUE;
        int maxElem=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])>max){
                max=map.get(arr[i]);
                maxElem=arr[i];
            }
        }
        return maxElem;
    }

    public static void main(String[] args) {

    }

}
