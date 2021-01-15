/*
                    String Repetition
Given a string s, return all of its repeated 10 character substrings.
Note: You may assume s only contains uppercase alphabetical characters.

Ex: Given the following string s…

s = "BBBBBBBBBBB", return ["BBBBBBBBBB"].
Ex: Given the following string s…

s = "ABABABABABABBBBBBBBBBB", return ["ABABABABAB","BBBBBBBBBB"].

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DevByte50 {

    public static List<String> repeatedStrings(String s) {

        List<String> repeated = new ArrayList<>();

        if (s == null || s.length()==0){
            return repeated;
        }
        Map<String,Integer> seen = new HashMap<>();

        for ( int i =0 ;i <s.length() - 9;i++){

            String current = s.substring(0,i+10);
            if (seen.getOrDefault(current,0) == 1){
                    repeated.add(current);
                    seen.put(current,seen.get(current)+1);
            } else {
                seen.put(current,seen.getOrDefault(current,0)+1);
            }
        }

        return repeated;

    }

    public static void main (String[] args) {

        String s="ABABABABABABBBBBBBBBBB";

        System.out.println(repeatedStrings(s).toString());


    }



}
