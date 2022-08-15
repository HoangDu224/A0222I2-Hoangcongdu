package ss11StackQueue.excercise.CountChar;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "Hello world";
        Map map = count(str);
        Set<Character> key = map.keySet();
        for (Character c : key) {
            System.out.println(c + ": " + map.get(c) + " lan");
        }

    }

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        return map;
    }
}