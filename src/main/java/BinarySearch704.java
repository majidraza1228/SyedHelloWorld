/*

Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. If target exists, then return its index, otherwise return -1.
Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
 */

public class BinarySearch704 {

    public static  int search(int[] nums, int target) {


        for ( int i = 0; i < nums.length; i++ ) {

            if ( nums[i] == target){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args){

        int[] input = {-1,0,3,5,9,12};

        System.out.println(search(input,9));

}}