/*

First Unique Character
This question is asked by Microsoft. Given a string, return the index of its
first unique character. If a unique character does not exist, return -1.

Ex: Given the following strings...

"abcabd", return 2
"thedailybyte", return 1
"developer", return 0
 */


import java.util.HashMap;
import java.util.Map;

public class DevByte45 {

    public static int firstUniqChar(String s) {

        Map<Character, Integer> charIndices = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            if (charIndices.containsKey(current)) {
                charIndices.put(current, Integer.MAX_VALUE);
            } else {
                charIndices.put(current, i);
            }
        }

        int min = Integer.MAX_VALUE;

        for (char c:charIndices.keySet()){
             min = Math.min(min,charIndices.get(c));
        }

       return min == Integer.MAX_VALUE ? -1: min;

    }


    public static void main(String[] args){
        String input ="abcabd";
        System.out.println(firstUniqChar(input));

    }
}
