package com.coveros.demo.helloworld;

public class StrongestEvenNumber {

    public static int strongestEven(int n, int m) {

        int max = 0;
        int result = 0;
        if(m % 2 == 1)
            m = m-1;
        for(int i = m; i >= n; i= i-2){

            int tmp = Integer.numberOfTrailingZeros(i);
            if(tmp > max){
                max = tmp;
                result = i;
            }
        }


        return result;

    }

    public static void main(String[] args){

        System.out.println(strongestEven(5,10));
    }


}
