/*
https://leetcode.com/problems/valid-anagram/
Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */

import java.util.HashMap;
import java.util.Map;

public class DevByte92 {


    public static  boolean isAnagram(String s, String t) {

        if (s.length()==0 || t.length()==0){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (char c : t.toCharArray()){
            if (!map.containsKey(c) || map.get(c)<=0){
                return false;
            } else{
                map.put(c,map.get(c)-1);
            }


        }
        return true;
    }

    public static void main(String[] args){

        String s="anagram";
        String t="nagaram";

        System.out.println(isAnagram(s,t));

    }
}
