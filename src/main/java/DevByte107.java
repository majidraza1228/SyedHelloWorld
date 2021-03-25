/*
https://leetcode.com/problems/single-number/
Given a non-empty array of integers nums, every element appears twice except for one.
 Find that single one.

Follow up: Could you implement a solution with a linear runtime complexity and without
using extra memory?

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4

 */

import java.util.HashMap;
import java.util.Map;

public class DevByte107 {
    public static  int singleNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap();
        int result=0;

        for ( int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

         for (Map.Entry<Integer,Integer> entry : map.entrySet()){
             if( entry.getValue()==1){
                 result =  entry.getKey();
             }
         }

         return result;
    }

    public static void main(String[] args){

        int[] result = {4,1,2,1,2};
        System.out.println(singleNumber(result));

    }


}
