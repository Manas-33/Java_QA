package f4.hashmaps;

import java.util.HashMap;
import java.util.Set;

public class InbuiltHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //insert
        map.put("abc", 1);
        map.put("def", 3);

        if (map.containsKey("abc")) {
            System.out.println("map has abc");
        }
        if (map.containsKey("abc1")) {
            System.out.println("map has abc1");
        }

        int v = map.get("abc");
        System.out.println(v);
        int v1 = 0;
        if (map.containsKey("abc1")) {
            v1 = map.get("abc1");
        }
        System.out.println(v1);

//        map.remove("abc");
//        map.remove("abc1");
        map.put("aac", 0);
        System.out.println(map.size());

        Set<String> keys = map.keySet();
        for (String s :
                keys) {
            System.out.println(s);
        }
    }
}