package com.coveros.demo.helloworld;

public class SumofPositive {

    public static int sum(int[] arr){

        int SumPositive=0;

        for(int n:arr){
            if (n>0)
                SumPositive+=n;
        }

        return SumPositive;
    }

    public static void main(String[] args) {

        int[] a={1,-2,3,4,5};

        System.out.print(sum(a));
    }
}
