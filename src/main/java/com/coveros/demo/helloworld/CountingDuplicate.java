package com.coveros.demo.helloworld;

import java.util.*;

public   class CountingDuplicate {

    public static int duplicateCount(String text) {
        // Write your code here
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            map.put(c, map.containsKey(c) ? 1 : 0);
        }
        return (int) map.values().stream().filter(e -> e > 0).count();
    }


        /*
        char[] ch = new char[text.length()];

        for ( int i=0; i<text.length();i++){
            ch[i]= text.charAt(i);
            }


        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for ( int j =0 ; j<ch.length;j++){
            Integer k = map.get(ch[j]);
            map.put(ch[j], (k == null) ? 1 : j );
        }

   return 2;
*/


    public  static void main (String[] args){
        System.out.print(duplicateCount("hello"));

    }


}
