/*

Insert Value
Given a sorted array of integers, nums, and a target, return the index of the target
 within nums. If it does not exist, return the index of where target should be inserted.

Ex: Given the following nums and target...

nums = [1, 5, 8, 12], target = 12, return 3.
Ex: Given the following nums and target...

nums = [3, 4, 7, 12, 29], target = 5, return 2.
 */


public class DevByte116 {

    public static int insertValue(int[] nums, int target) {

        int left =0;
        int right=nums.length;

        while (left <=right){

            int middle = (left+right)/2;
            if (nums[middle]== target) {
                return middle;
            }
            else if (nums[middle]> target){
                right = middle-1;
            }
            else {
                left = middle+1;
            }
        }
        return left;

    }

    public static void main(String[] args){

        int[] input={1, 5, 8, 12};

        System.out.print(insertValue(input,12));

    }

}
