package com.coveros.demo.helloworld;

import java.util.*;

public class MyLanguages<AscList> {
    public static List<String> myLanguages(final Map<String, Integer> results) {


        HashMap<String,Integer> mapResult = new HashMap<>();
        List<String> abc= new ArrayList<>();
        for (Map.Entry<String, Integer> val : results.entrySet()) {
            if (val.getValue() >= 60)
               mapResult.put(val.getKey(),val.getValue());
        }

        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(mapResult.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        Collections.reverse(list);

    List<String>  AscList = new ArrayList<>();
        for (Map.Entry<String, Integer> aa : list) {
            AscList.add(aa.getKey());
        }

        return AscList;
    }

        //  Map<String, Integer> unSortedMap = mapResult;


/*
//LinkedHashMap preserve the ordering of elements in which they are inserted
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        unSortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        for (Map.Entry<String, Integer> val : sortedMap.entrySet()) {
                      abc.add(val.getKey().toString());
        }

        return abc;
*/


    public static void main (String[] args){
        final Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);

        System.out.print (myLanguages(map2));



    }
}