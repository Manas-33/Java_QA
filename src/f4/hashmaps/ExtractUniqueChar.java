package f4.hashmaps;

import java.util.HashMap;

public class ExtractUniqueChar {
    public static String uniqueChar(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        String output="";
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else{
                output+=c;
                map.put(c,1);
            }
        }
        return output;
    }
}
