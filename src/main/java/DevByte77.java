/*
Find Value
Given a sorted integer array nums and a target, search for the target with in the
array. If the targets exists within the array, return its index.
If it does not exist within the array, return -1.

Ex: Given the following nums and target...

nums = [-5, -3, 0, 3, 8, 12, 40], target = 8, return 4.
 */


public class DevByte77 {

    public static  int findValue(int[] nums, int target) {


        int left =0;
        int right= nums.length-1;

        if( nums==null && nums.length==0){
            return -1;
        }
        while (left<=right){

            int mid = left+ (right-left)/2;
            if (target==nums[mid]){
                return mid;
            } else if ( nums[mid] > target){
                right = mid-1;
            } else if (nums[mid] <target){
                left = mid+1;
            }


        }
            return -1;
    }

public static void main(String[] args){

        int[] input = {-5, -3, 0, 3, 8, 12, 40};

        System.out.println(findValue(input,8));

}


}
