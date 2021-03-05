/*

Take Two
Given an array of integers, nums, each element in the array either appears once or
twice. Return a list containing all the numbers that appear twice.
Note: Each element in nums is between one and nums.length (inclusive).

Ex: Given the following array nums…

nums = [2, 3, 1, 5, 5], return [5].
 */


import java.util.ArrayList;
import java.util.List;

public class DevByte61 {

    public static List<Integer> takeTwo(int[] nums) {

     List<Integer> duplicates = new ArrayList<>();

     for ( int i =0;i <nums.length;i++) {
         int index = Math.abs(nums[i])-1;

         if (nums[index] <0){
             duplicates.add(Math.abs(index+1));
         }
         nums[index] = -nums[index];

     }

     return duplicates;

    }

    public static void main(String[] args){

        int[] input={2, 3, 1, 5, 5};

        System.out.println(takeTwo(input));
    }

}
