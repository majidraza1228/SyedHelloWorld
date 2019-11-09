package com.coveros.demo.helloworld;

import java.util.HashSet;
import java.util.Set;

public   class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        Set<Character> vowels = new HashSet();

        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');

        char[] characters = str.toCharArray();


        for ( int i =0; i<=characters.length-1;i++) {

            if ( vowels.contains(characters[i])){
                vowelsCount++;
            }

        }

        return vowelsCount;
    }

    public static void main(String[] args){

        System.out.println(getCount("majid"));
    }
}
