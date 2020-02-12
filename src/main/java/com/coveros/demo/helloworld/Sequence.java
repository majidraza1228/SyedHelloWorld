package com.coveros.demo.helloworld;

import java.util.LinkedList;
import java.util.List;

public class Sequence {

    public static int[] reverse(int n) {
        //your code
        if (n < 0)
            return null;

        List<Integer> seq = new LinkedList<>();

        while (n > 1) {
            seq.add(n);
            n -= 1;
        }
        int[] primitive = seq.stream()
                .mapToInt(Integer::intValue)
                .toArray();

      return primitive;

    }

    public static void main(String[] args){

        System.out.print(reverse(5));
    }
 }
