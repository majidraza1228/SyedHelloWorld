/*

Most Popular
Given a paragraph and a list of banned words, return the most frequently occurring word that
is not banned. Treat words case insensitively and ignore punctuation.

Ex: Given the following paragraph and list of banned words...

paragraph = "The daily, the byte Daily.", banned = [“the”], return “daily”.
 */


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DevByte109 {


    public static String mostPopular(String paragraph, String[] banned) {

        Set<String> bannedSet = new HashSet<>();
        String result="";

        for ( String s: banned){
            bannedSet.add(s);
        }

        Map<String,Integer> map = new HashMap<>();

        String[] paraWords = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ");

        for ( String s : paraWords){
            if (!bannedSet.contains(s)){
                map.put(s, map.getOrDefault(s,0)+1);
            }
        }
        int topValue=0;
        for (Map.Entry<String, Integer> entry: map.entrySet() ){
            if (entry.getValue() >topValue){
                result = entry.getKey();
                topValue= entry.getValue();
            }
        }

    return result;
    }

    public  static void main(String[] args){

       String paragraph = "The daily, the byte Daily.";
       String[] banned= {"the"};

       System.out.println(mostPopular(paragraph,banned));
    }
}
