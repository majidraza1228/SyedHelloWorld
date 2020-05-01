/*
Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Example 1:

Input: [2,2,3,2]
Output: 3
 */

import java.util.HashMap;

public class SinlgleNumber137 {


    public static int singleNumber(int[] nums) {

        if (nums.length==0) {
            return -1;
        }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i: nums
             ) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for (int k: map.keySet()
             ) {
                if (map.get(k) ==1  )
                    return k;
        }
        return -1;


    }

    public static void main(String[] args){

        int[] input = {2,2,3,2};

        System.out.println(singleNumber(input));


    }
}
