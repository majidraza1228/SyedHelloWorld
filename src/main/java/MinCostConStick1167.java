/*
You have some sticks with positive integer lengths.
You can connect any two sticks of lengths X and Y into one stick by paying a cost of X + Y.  You perform this action until there is one stick remaining.
Return the minimum cost of connecting all the given sticks into one stick in this way.
Example 1:

Input: sticks = [2,4,3]
Output: 14
 */

import java.util.PriorityQueue;

public class MinCostConStick1167 {

    public static int connectSticks(int[] sticks) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int cost=0;

        for (int stick: sticks
             ) {
            minHeap.add(stick);
        }

        while (minHeap.size()>1){
            cost += minHeap.remove()+minHeap.remove();
            minHeap.add(cost);
        }

        return cost;

    }


    public static void main(String[] args){

     int[] input = {2,4,3};

     System.out.println(connectSticks(input));

    }




}
