package com.coveros.demo.helloworld;

import java.util.HashSet;

public class IntersectionArray {


    public int[]  intersection(int[] num1, int[] num2) {
        HashSet<Integer> set = new HashSet();
        for (int i :num1){
            set.add(i);
         }

        HashSet<Integer> intersection = new HashSet();

        for (int i: num2){
            if ((set.contains(i))){
                intersection.add(i);
            }
        }

        int[] result = new int[intersection.size()];
        int index=0;

        for (int  i:intersection) {
            result[index++]=i;
        }

        return result;
    }

   public static void main (String args[]){

       IntersectionArray objCommonArray =new IntersectionArray();
       int[] FirstArray = {1,2,5};
       int[] SecondArray = {4,5,2};

       int[] result;

       result = objCommonArray.intersection(FirstArray,SecondArray);

       for (int i=0;i <= result.length-1;i++)
            System.out.println(result[i]);

   }



}
