/*
https://leetcode.com/problems/palindrome-permutation/
Share
Given a string s, return true if a permutation of the string could form a
palindrome.
Example 1:

Input: s = "code"
Output: false
Example 2:

Input: s = "aab"
Output: true
 */


import java.util.HashMap;
import java.util.Map;

public class DevByte95 {


    public static boolean canPermutePalindrome(String s) {

        Map<Character,Integer> map = new HashMap<>();

        for ( char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int count =0;
        for (char k : map.keySet()){
            count += map.get(k)%2;
        }
            return count <=1;
    }

    public static void main(String[] args){

            System.out.println(canPermutePalindrome("aab"));
    }
}
