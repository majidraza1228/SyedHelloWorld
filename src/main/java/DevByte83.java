/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the returned length.
 */

import java.util.HashSet;
import java.util.Set;

public class DevByte83 {


    public static  int removeDuplicates(int[] nums) {
        Set<Integer> set =  new HashSet<>();

        for( int i :nums)
            set.add(i);

       return set.size();

    }

    public static void main(String[] args){

        int[] input ={0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(input));

    }
}
