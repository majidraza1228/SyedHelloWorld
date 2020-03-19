/*
Conditions:

You will pick exactly 2 numbers.
You cannot pick the same element twice.
If you have muliple pairs, select the pair with the largest number.
Example 1:

Input: nums = [1, 10, 25, 35, 60], target = 90
Output: [2, 3]
Explanation:
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Find2Sum {
    private static int[] Find2Sum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int[] res = new int[] {-1, -1};

        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                if(nums[i] > max || nums[map.get(nums[i])] > max) {
                    res[0] = map.get(nums[i]);
                    res[1] = i;
                    max = Math.max(nums[i], nums[map.get(nums[i])]);
                }
            }
            map.put(target - nums[i], i);
        }
        return res;

    }

public static void main(String[] args){

    int[] nums1 = {1, 10, 25, 35, 60};
    int target1 = 90;
    System.out.println(Arrays.toString(Find2Sum(nums1, target1-30)));


    }
}
