package ls;

import java.util.HashMap;
import java.util.Map;
public class lab_exam8 {
    public static void main(String[] args) {
        String str = "This this is is done by Saket Saket";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            Integer integer = hashMap.get(word);
            if (integer == null)
                hashMap.put(word, 1);
            else {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}
