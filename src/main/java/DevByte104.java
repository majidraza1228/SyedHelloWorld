/*
https://leetcode.com/problems/sort-array-by-parity/

Given an array A of non-negative integers, return an array consisting of all the even
elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition
Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */

public class DevByte104 {

    public  static int[] sortArrayByParity(int[] A) {

        int[] result = new int[A.length];
        int index = 0;

        for (int i : A) {
            if (i % 2 == 0) {
                result[index++] = i;
            }
        }
        for (int i : A) {
            if (i % 2 == 1) {
                result[index++] = i;
            }

        }
        return result;
    }
    public static void main (String[] args){

        int[] input ={3,1,2,4};
        int[] result = sortArrayByParity(input);

        for(int i : result)
            System.out.print(i +",");
    }

}
