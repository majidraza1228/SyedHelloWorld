/*

names = 'apple apple banana apple banana orange'
## output = {'apple':3, 'banana':2, 'orange':1}
 */

import java.util.Map;
import java.util.TreeMap;

public class DevByte103 {

public static String CountWords(String words) {

    String[] wordsCount = words.split(" ");
    TreeMap<String, Integer> map = new TreeMap<String, Integer>();

    for (String s : wordsCount) {
            if (!map.containsKey(s)) {
                map.put(s, map.getOrDefault(s, 1));
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey() + " :" + entry.getValue() + " ");
        }
        return sb.toString();

    }


    public static void main (String[] args){

        String names = "apple apple banana apple banana orange";
        System.out.println(CountWords(names));

    }
}

