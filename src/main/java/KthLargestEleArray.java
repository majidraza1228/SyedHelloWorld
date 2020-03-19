import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestEleArray {
    public static int findKthLargest(int[] nums, int k) {
/*
        Arrays.sort(nums);
        return nums[nums.length-k];
        */

        //  Heap ---> Priority Queue

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (int i : nums
        ) {
            minHeap.add(i);

            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }


    public static void main(String[] arr){

     int[] inputArray = {3,2,1,5,6,4};

     System.out.print(findKthLargest(inputArray,2));

    }
}
