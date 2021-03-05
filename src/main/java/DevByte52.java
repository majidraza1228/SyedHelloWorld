/*

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in
pattern and a non-empty word in s.
Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:
dog a
cat b
cat b
dog a

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DevByte52 {


    public boolean wordPattern(String pattern, String s) {

    HashMap  map  = new HashMap<>();
    String[] words = pattern.split(" ");

    if ( words.length!= s.length())
        return false;

    for ( int i=0; i < words.length; i++){

        char patternChar  = pattern.charAt(i);
        String word = words[i];


        Character stringChar = s.charAt(i);

        if (!map.containsKey(patternChar)) {
            map.put(patternChar, i);
        }

        if ( !map.containsKey(word)) {
            map.put(word, i);
        }

        if (map.get(patternChar)  != map.get(word)){
            return false;
        }

    }
        return true;
    }

    public static void main(String[] args){

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        Integer[] intArray = new Integer[intList.size()];
        intArray = intList.toArray(intArray);

        for(Integer i : intArray)
            System.out.println(i);
    }
}
