/*

Common Values
Given two integer arrays, nums1 and nums2, return the intersection of the two arrays (i.e. the elements they have in common).

Ex: Given the following nums1 and nums2...

nums1 = [1, 2, 2, 3], nums2 = [0, 2, 2, 5], return [2, 2].
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DevByte105 {


    public static List<Integer> intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for ( int i : nums1){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for ( int i : nums2){
            if ( map.containsKey(i) && map.get(i)>0){
                result.add(i);
                map.put(i,map.get(i)-1);
            }
        }
          return result;
    }

    public static void main(String[] args){

        int[] nums1 ={1, 2, 2, 3};
        int[]  nums2 ={0, 2, 2, 5};

System.out.println(intersect(nums1,nums2));
    }
}
