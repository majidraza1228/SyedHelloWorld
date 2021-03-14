/*
162. Find Peak Element

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
 */



public class DevByte67 {

    public static int findPeakElement(int[] nums) {

        for ( int i = 0;i< nums.length-1;i++){

            if (nums[i] > nums[i+1]){
                 return i;
            }
        }
        return nums.length -1;
    }

    public static void main(String[] args){

        int[] test ={1,2,3,1};

        System.out.println(findPeakElement(test));

    }


}
