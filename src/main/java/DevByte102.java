/*
https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
Given an array and a number k where k is smaller than size of array, we need to find the k’th smallest element in the given array. It is given that all array elements are distinct.

Examples:

Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 3
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 4
Output: 10

 */
import java.util.PriorityQueue;

public class DevByte102 {
    public static int kthSmallest(Integer[] arr,
                                  int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for ( int i: arr){
                        pq.offer(i);
        }

        int n=0;
        while (k>0){
            n = pq.poll();
            k--;
        }
        return n;

    }

    public static void main(String[] args){

        Integer[] input = {7, 10, 4, 3, 20, 15};

        System.out.println(kthSmallest(input,4));
    }

}
