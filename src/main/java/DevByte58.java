/*

https://leetcode.com/problems/next-greater-element-i/solution/
Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation:
For number 2 in the first array, the next greater number for it in the second array is 3.
For number 4 in the first array, there is no next greater number for it in the second
array, so output -1.
 */


import java.util.HashMap;
import java.util.Stack;

public class DevByte58 {

    public int[] nextGreaterElement(int[] findNums, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        int[] result = new int[findNums.length];

        for (int i =0;i <nums2.length;i++){

            while (!stack.isEmpty() && nums2[i] >stack.peek()){
                    map.put(stack.pop(),-1);
            }
            stack.push(nums2[i]);
        }

        while (!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }

        for ( int i= 0; i < findNums.length;i++){
            result[i] = map.get(findNums[i]);
        }

        return result;

    }

    public static void main(String[] args){


    }



}
