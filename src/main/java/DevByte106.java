/*
https://leetcode.com/problems/squares-of-a-sorted-array/

Given an integer array nums sorted in non-decreasing order, return an array of the squares
of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DevByte106 {

    public static int[] sortedSquares(int[] nums) {

        List<Integer> resultTemp = new ArrayList<Integer>();
        int[] result = new int[nums.length];

        for ( Integer i : nums){
            resultTemp.add(i*i);
        }

         Collections.sort(resultTemp);
         for( int i =0;i< nums.length;i++){
              result[i]= resultTemp.get(i);
         }
        return result;

    }

    public static void main(String[] args){

        int[] input= {-4,-1,0,3,10};
        int[] result = sortedSquares(input);

        for  ( int i : result)
             System.out.print(i+", ");

    }
}
