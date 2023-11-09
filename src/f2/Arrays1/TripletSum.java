package f2.Arrays1;

import java.util.*;
public class TripletSum {

    public static int findTriplet(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            HashMap<Integer, Integer> complementMap = new HashMap<>();

            int currentTarget = target - arr[i];

            for (int j = i + 1; j < n; j++) {
                int currentElement = arr[j];
                int complement = currentTarget - currentElement;

                if (complementMap.containsKey(complement)) {
                    count += complementMap.get(complement);
                }
                complementMap.put(currentElement, complementMap.getOrDefault(currentElement, 0) + 1);
            }
        }

        return count;
    }

}
