/*
Ex: Given the following arrays...

nums1 = [2, 4, 4, 2], nums2 = [2, 4], return [2, 4]
nums1 = [1, 2, 3, 3], nums2 = [3, 3], return [3]
nums1 = [2, 4, 6, 8], nums2 = [1, 3, 5, 7], return []
Big-O Analysis
Runtime: O(N) where N is the total number of elements in nums1 and nums2.
Space complexity: O(M) where M is the total number of elements in nums1.
 */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DevByte3 {

    public static List<Integer> intersection(int[] nums1, int[] nums2){

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums1)
            set.add(i);

        List<Integer> common = new ArrayList<Integer>();
        for ( int i =0;i<nums2.length;i++){

            if (set.contains(nums2[i])){
                    common.add(nums2[i]);
                    set.remove(nums2[i]);
            }

        }
            return common;

    }

    public static void main(String[] args) {

        int nums1[] ={2, 4, 4, 2};
        int nums2[] = {2, 4};

        System.out.println(intersection(nums1,nums2));

    }





    }

