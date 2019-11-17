package com.coveros.demo.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorter {

    public static List<String> sort(List<String> textbooks) {
        //Cramming right before a test can't be that bad?
        //use sort() from Collections with the static field of String class to ensure case insensitivity
        Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
        return textbooks;

    }

    public static void main (String[] args){

        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        for(String s : new String[] {"Algebra", "History", "Geometry", "English"})
            strs.add(s);

       Sorter.sort(strs);
       for (String str: strs){
           System.out.println(str);
       }

    }
}
