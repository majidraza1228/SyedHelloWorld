package com.coveros.demo.helloworld;

import java.util.stream.IntStream;

public class SequenceSum {
    public static String showSequence(int value){
        //for
        int j=0;
        if ( value==0)
            return "0=0";
        if (value <0)
            return value+"<0";

        String sequenceString = "";
        for ( int i =0 ;i<=value;i++)
        {
            j+=i;
            sequenceString+=String.valueOf(i)+"+";

        }

        //  while
        sequenceString = sequenceString.substring(0,sequenceString.length()-1);
        sequenceString=sequenceString+ " = "+j;
        return sequenceString;
    }

    public static void main(String[] args){
        IntStream.range(0, 5).forEach(i -> {
            System.out.println(i);
        });
        //System.out.println(showSequence(-1));
    }
}
