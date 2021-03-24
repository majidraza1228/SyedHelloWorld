/*
Continuous Sums
Given an array of integers, nums, and a value k, return the number of continuous
subarrays that sum to k.

Ex: Given the following nums and k…

nums = [1,1,4], k = 5, return 1.
nums = [3, 2, 2, 1, 1, 1], k = 5, return 3.


 */

import java.util.HashMap;
import java.util.Map;

public class DevByte94 {
    public static int continuousSums(int[] nums, int k) {

        int sum=0;
        int count =0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for (int i =0;i< nums.length;i++){
            sum += nums[i];
            if( map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);

        }

        return count;

    }

    public static void main(String[] args){

        int[] input={1,1,4};

        System.out.println(continuousSums(input,5));

    }


}
