/*
https://leetcode.com/problems/running-sum-of-1d-array/
1480. Running Sum of 1d Array
Easy

array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */


public class DevByte82 {


    public static int[] runningSum(int[] nums) {
        int runningTotal =0;

        for (int i =0; i <nums.length;i++){

             runningTotal +=nums[i];
             nums[i]=runningTotal;
        }

            return nums;
    }

    public static void main(String[] args){

        int[] input={1,2,3,4};

        int[] result =runningSum(input);

        for(int i  : result)
            System.out.print(i+",");

        System.out.println();

    }
}
