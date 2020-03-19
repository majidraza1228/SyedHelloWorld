/*
Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
 */

public class RotateArray189 {

    public static void rotate(int[] nums, int k) {

        k= k % nums.length;

        Reverse(nums,  0, nums.length-1);
        Reverse(nums,0,k-1);
        Reverse(nums,k, nums.length-1);

    }

    public static void Reverse(int[] nums, int start, int end ){

        while (start< end){

            int temp;

            temp = nums[start];
            nums[start]=nums[end];
            nums[end]= temp;
            start++;
            end--;
        }

    }


    public static void main(String[] args){

        int[] input ={1,2,3,4,5,6,7};

        rotate(input,3);

    }
}
