/*
https://leetcode.com/problems/single-number/
Add to List

Share
Given a non-empty array of integers nums, every element appears twice except for one
. Find that single one.

Follow up: Could you implement a solution with a linear runtime complexity and
without using extra memory?
Example 1:

Input: nums = [2,2,1]
Output: 1
 */

import java.util.HashMap;
import java.util.Map;

public class DevByte75 {


    public static int singleNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for ( int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

         for (int i : map.keySet()){
             if (map.get(i)==1){
                 return i;
             }
         }
           return 0;
    }

    public static void main(String[] args){

        int[] input ={2,2,1};

        System.out.println(singleNumber(input));
    }
}
