/*
https://leetcode.com/problems/majority-element/
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DevByte97 {

    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i : nums){
                map.put(i,map.getOrDefault(i,0)+1 );
        }

        int result = Collections.max(map.keySet());

        return result;
    }

    public static void main(String[] args){

        int[] input={2,2,1,1,1,2,2};

        System.out.println(majorityElement(input));

    }
}
