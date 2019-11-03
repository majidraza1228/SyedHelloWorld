package com.coveros.demo.helloworld;

public class MinimumElement {

    public static int findMin( int[] a, int n){

        if (n==1)
            return a[0];
        int tmp = findMin(a,n-1);
        if (a[n-1] < tmp)
              return a[n-1];
        else
            return tmp;

    }
public static void main (String[] args){

        int[] a={4,2,4,4,1};

        System.out.println(findMin(a,a.length));
}
}
