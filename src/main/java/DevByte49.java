/*
nums1 = [2, 4, 4, 2], nums2 = [2, 4], return [2, 4]
nums1 = [1, 2, 3, 3], nums2 = [3, 3], return [3]
nums1 = [2, 4, 6, 8], nums2 = [1, 3, 5, 7], return []

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DevByte49 {
    public List<Integer> intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1){
            set.add(num);
        }

        List<Integer> common = new ArrayList<>();

        for (int i =0;i<nums2.length-1;i++){

            if (set.contains(nums2[i])){
                common.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
            return common;
    }


}
