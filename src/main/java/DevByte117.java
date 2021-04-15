/*
Largest Unique Value
Given an integer array, nums, return the largest unique value in nums.

Ex: Given the following nums…

nums = [4, 9, 2, 9], return 4.
Ex: Given the following nums…

nums = [8, 1, 10, 1, 4, 8, 4, 10], return -1.
 */

import java.util.HashMap;
import java.util.Map;

public class DevByte117 {


    public static int largestUniqueValue(int[] nums) {

       Map<Integer,Integer> map = new HashMap<>();
       int max =-1;

        for( int i : nums){
            map.put( i,map.getOrDefault(i,0)+1);
        }

        for ( int num: map.keySet()){

            if (map.get(num)==1 && num>max){
                max=num;
            }
        }
            return max;
    }


    public static void main(String[] args){

        int[] input ={4, 9, 2, 9};
        System.out.println(largestUniqueValue(input));

    }
}
