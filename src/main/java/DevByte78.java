/*
K Distinct Characters
Given a string s and a value k, return the length of the longest substring that
contains at most k distinct character.

Ex: Given the following string s and integer k...

s = "abccccd", k = 3, return 6 (“abcccc” is length 6).
Ex: Given the following string s and integer k...

s = "rrr", k = 1, return 3.

 */


import java.util.HashMap;
import java.util.Map;

public class DevByte78 {

    public static  int kDistinctCharacters(String s, int k) {

        if ( s ==null || s.length()==0 || k ==0 )
            return 0;

        Map<Character,Integer> map = new HashMap<>();

        int max = 0;
        int start= 0;
        int end =0;

        while ( end < s.length()){

            char current = s.charAt(end++);
            map.put(current, map.getOrDefault(current,0)+1);
            while (map.size()> k){

                char startCharacter = s.charAt(start++);
                map.put(startCharacter,map.get(startCharacter)-1);
                if (map.get(startCharacter) == 0){
                    map.remove(startCharacter);
                }
            }
                max = Math.max(max,end -start);
        }
            return max;

    }


  public static void main(String[] args){

        String  s = "abccccd";

        System.out.println(kDistinctCharacters(s,3));
  }

}
