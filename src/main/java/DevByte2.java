/*

[1, 3, 8, 2], k = 10, return true (8 + 2)
[3, 9, 13, 7], k = 8, return false
[4, 2, 6, 5, 2], k = 4, return true (2 + 2)

*/


import java.util.HashSet;
import java.util.Set;

public class DevByte2 {


    public static boolean AddTwoSum(int[] nums,int k){

        Set<Integer> set =new HashSet<>();
        for(int i =0;i <nums.length;i++){

            int diff = k - nums[i];
            if (set.contains(diff)){
                return true;
            }
                set.add(nums[i]);
        }
        return false;

    }

    public static void main (String[] args){

       int[] test ={1, 3, 8, 2};

       System.out.println(AddTwoSum(test,10));

    }
}
