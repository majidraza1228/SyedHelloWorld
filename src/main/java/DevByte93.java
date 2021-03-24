/*

Remove Value
Given an integer array nums and a value, val, remove all instances of val in-place and
return the length of the new array.
Note: It does not matter what values you leave in the array beyond the array’s new
length.
Ex: Given the following nums and val...

nums = [1, 2, 3], val = 2, return 2 (after your modifications your array could look like [1, 3, 3]).
 */


public class DevByte93 {

    public static int removeValue(int[] nums, int val) {

        int index =0;

        for (int i :nums){

            if ( i !=val){
                nums[index++]=i;
            }
        }
        return index;
    }

    public static void main(String[] args){

        int[] input ={1, 2, 3};

        System.out.println(removeValue(input,2));

    }
}
