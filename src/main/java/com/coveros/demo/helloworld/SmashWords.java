package com.coveros.demo.helloworld;

import java.util.Arrays;

public  class SmashWords {

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        String smashWord="";


        for (int i=0; i< words.length; i++){

            smashWord =smashWord+words[i]+" ";

        }
          return smashWord.trim();
    }

    public  static void main(String[] args){

        String[] words = {"Bilal", "Djaghout" };
        System.out.print( smash(words));

    }
}
