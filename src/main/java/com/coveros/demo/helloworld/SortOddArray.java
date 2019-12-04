package com.coveros.demo.helloworld;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortOddArray {

    public static int[] sortArray(int[] array) {

        if (array.length==0)
            return array;


        ArrayList<Integer> OddArray = new ArrayList<>();
        int ArrayElement;
        int j =0;
        for (int i =0; i< array.length;i++){

            ArrayElement= array[i];

            if ( ArrayElement% 2!=0){
                OddArray.add(ArrayElement);
            }
        }
            if (OddArray.size()>1)
                Collections.sort(OddArray);

        for (int i =0; i< array.length;i++){

            ArrayElement= array[i];

            if ( ArrayElement% 2!=0){
                array[i]= OddArray.get(j);
                j++;
            }
        }

        return array;
    }

    public static void main(String args[]) {

        int a[] = { 9, 7, 8, 3, 6, 1 };

        int[] sortedArray = new int[a.length];

        sortedArray= sortArray(a);

    }

}
