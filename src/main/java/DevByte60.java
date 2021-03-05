/*
                Third Largest
Given an array nums, return the third largest (distinct) value.
Note: If the third largest number does not exist, return the largest value.

Ex: Given the following array nums…
nums = [1, 4, 2, 3, 5], return 3.
 */

import java.util.HashSet;
import java.util.PriorityQueue;

public class DevByte60 {

    public static  int thirdLargest(int[] nums) {

        PriorityQueue<Integer > heap = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();

        for( int i: nums){

            if (!set.contains(i)){
                heap.add(i);
                set.add(i);

                if (heap.size()>3){
                    set.remove(heap.remove());
                }
            }
        }

        if (heap.size()<3)
        {
            while (heap.size()>1){
                heap.remove();
            }
        }

        return heap.peek();

    }

    public static void main(String[] args){

        int[] testInput = {1, 4, 2, 3, 5};

        System.out.println(thirdLargest(testInput));
    }
}
