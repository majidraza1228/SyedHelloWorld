/*

Given an array of integers, nums, and a value k, return the kth largest element.

Ex: Given the following array nums…

[1, 2, 3], k = 1, return 3.
Ex: Given the following array nums…

[9, 2, 1, 7, 3, 2], k = 5, return 2.
 */


import java.util.PriorityQueue;

public class DevByte46 {

    public static int kthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (int n : nums) {

            if (minHeap.size() < k) {
                minHeap.add(n);

            } else if (n > minHeap.peek()) {
                minHeap.remove();
                minHeap.add(n);
            }

        }
        return minHeap.remove();
    }



public static void main(String[] args){

        int[] input = {9, 2, 1, 7, 3, 2};

        System.out.println(kthLargest(input,5));

}
}
