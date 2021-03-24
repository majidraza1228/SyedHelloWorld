/*
https://leetcode.com/problems/last-stone-weight/solution/
We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have
weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are
 no stones left.)
Example 1:

Input: [2,7,4,1,8,1]
Output: 1

 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class DevByte101 {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int n : stones){
            maxHeap.add(n);
        }

        while (maxHeap.size()>1) {
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();

            if (stone1 != stone2) {
                maxHeap.add(stone1 - stone2);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.remove();
    }

    public static void main(String[] args){

        int[] testStone ={2,7,4,1,8,1};

        System.out.println(lastStoneWeight(testStone));


    }
}
