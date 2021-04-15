/*
Theft
You are a thief trying to steal from houses in a neighborhood. The amount of money that
can be stolen from the ith house is represented by nums[i]. While you’d like to steal
from all the houses, if adjacent houses are broken into, the police are notified via a security system. Return the largest amount of money you can steal without alerting the police.
Note: You may not modify nums.
Ex: Given the following nums...

nums = [1, 3, 2, 5, 2], return 8.
 */

public class DevByte115 {
    public  static int theft(int[] nums) {

        if (nums==null || nums.length==0){
            return 0;
        }

        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==3){
            return Math.max(nums[0],nums[1]);
        }

        int[] dp =new int[nums.length];

        dp[0] =nums[0];
        dp[1] =Math.max(nums[0],nums[1]);

        for (int i=2;i<nums.length;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
            return dp[nums.length-1];
    }

    public static void main(String[] args){

        int[] input ={1, 3, 2, 5, 2};

        System.out.print(theft(input));


    }
}
