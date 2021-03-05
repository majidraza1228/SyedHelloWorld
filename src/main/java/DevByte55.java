/*
27. Remove Element
https://leetcode.com/problems/remove-element/

 */

public class DevByte55 {

    public int removeElement(int[] nums, int val) {

        int i =0;
        for ( int j =0; j <nums.length;j++){

            if (nums[j] != val){
                nums[i] =nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args){


    }

}
