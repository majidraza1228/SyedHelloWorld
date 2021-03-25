/*
https://leetcode.com/problems/ransom-note/
Given an arbitrary ransom note string and another string containing letters from all the
magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class DevByte110 {


    public static  boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        for ( char s: magazine.toCharArray() ){
            map.put(s, map.getOrDefault(s,0)+1);
        }

        int ramSoncount = ransomNote.length();

        for( char c : ransomNote.toCharArray()){

            int InCountMagazine = map.getOrDefault(c,0);

            if (InCountMagazine ==0)
                return false;
                map.put(c, map.get(c)-1);

        }

     return true;
    }

    public static void main(String[] args){

        System.out.println(canConstruct("aa","aab"));
    }
}
