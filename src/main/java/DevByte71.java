/*https://leetcode.com/problems/remove-element/
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2]
 */

public class DevByte71 {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        for (int i = 0 ; i <nums.length;i++){

            if (nums[i]  !=val){
               // nums[j]= nums[i];
                j++;
            }

        }
     return j;
    }

    public static void main(String[] args){

        int[] test ={3,2,2,3};

        System.out.println(removeElement(test,2));
    }
}
