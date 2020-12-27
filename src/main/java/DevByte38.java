/*
                                Array Shuffle
This question is asked by Amazon. Given an array of integers, nums, sort the
array in any manner such that when i is even, nums[i] is even and when i is odd,
 nums[i] is odd.
Note: It is guaranteed that a valid sorting of nums exists.

Ex: Given the following array nums…

nums = [1, 2, 3, 4], one possible way to sort the array is [2,1,4,3]

 */

import java.util.Arrays;

public class DevByte38 {

    public static int[] rearrangeElements(int[] nums) {

        int[] sorted = new int[nums.length];

        int evenIndex=0;
        int oddIndex =1;

        for ( int i =0; i < nums.length;i ++){

            if (nums[i] %2==0){
                sorted[evenIndex]=nums[i];
                evenIndex +=2;
            }
            if (nums[i] %2==1){
                sorted[oddIndex]=nums[i];
                oddIndex +=2;
            }

        }

        return sorted;

    }

    public static void main(String[] args){

        int[] input={1, 2, 3, 4};

        int[] result;
        result= rearrangeElements(input);

        for( int j : result)
            System.out.println(j);

    }


}
