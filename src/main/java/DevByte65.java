/*
                        Group Words
Given a list of strings, return a list of strings containing all anagrams grouped together.

Ex: Given the following list of strings strs…
strs = ["car", "arc", "bee", "eeb", "tea"], return
[
  ["car","arc"],
  ["tea"],
  ["bee","eeb"]
]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DevByte65 {
    public static List<List<String>> groupWords(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();

        HashMap<String,List<String>> map= new HashMap<>();

        for (String curr : strs){
            char[] characters = curr.toCharArray();

            Arrays.sort(characters);
            String sorted = new String(characters);

            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(curr);
        }

        groupedAnagrams.addAll(map.values());

        return groupedAnagrams;

    }


    public static void main(String[] args){

        String[] input = {"car", "arc", "bee", "eeb", "tea"};

        System.out.println(groupWords(input));


    }

    }



