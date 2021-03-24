/*
Partners
Given an integer array, nums, return the total number of “partners” in
the array.
Note: Two numbers in our array are partners if they reside at different
 indices and both contain the same value.

Ex: Given the following array nums…

nums = [5, 5, 3, 1, 1, 3, 3], return 5.
5 (index 0) and 5 (index 1) are partners.
1 (index 3) and 1 (index 4) are partners.
3 (index 2) and 3 (index 5) are partners.
3 (index 2) and 3 (index 6) are partners.
3 (index 5) and 3 (index 6) are partners.
 */

import java.util.HashMap;
import java.util.Map;

public class DevByte91 {

    public static int numPartners(int[] nums) {

        int goodPairs=0;

        Map<Integer,Integer> map = new HashMap<>();

        for (int i : nums){
            if (map.containsKey(i)){
                goodPairs += map.get(i);
            }
                map.put(i, map.getOrDefault(i,0)+1);

        }

    return goodPairs;

        

    }

    public static void main(String[] args){

        int[] input = {5, 5, 3, 1, 1, 3, 3};

        System.out.println(numPartners(input));

    }




}



