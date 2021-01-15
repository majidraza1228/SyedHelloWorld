/*
Is Monotonic
This question is asked by Facebook.

nums = [1, 2, 3, 4, 4, 5], return true.
Ex: Given the following array nums…

nums = [7, 6, 3], return true.
Ex: Given the following array nums…

nums = [8, 4, 6], return false.
 */

public class DevByte41 {

    public static boolean isMonotonic(int[] nums) {

        boolean increasing = true;
        boolean decreasing = true;

        for ( int i =0 ;i <nums.length-1;i++) {

            if (nums[i] >nums[i+1]){
                increasing=false;
            }
            if (nums[i] <nums[i+1]){
                decreasing=false;
            }

        }
                return increasing || decreasing;
    }


    public static void main(String[] args){

        int[] input = {8, 4, 3};

        System.out.println(isMonotonic(input));


    }

}
