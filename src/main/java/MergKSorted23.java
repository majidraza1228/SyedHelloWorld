/*
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
Example:
Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
 */

import java.util.PriorityQueue;

public class MergKSorted23 {

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (ListNode head: lists
             ) {
                while (head != null) {
                    minHeap.add(head.val);
                    head = head.next;
                }
        }
                ListNode dummy = new ListNode(-1);
                ListNode head = dummy;

                while   (!minHeap.isEmpty()){
                        head.next= new ListNode(minHeap.remove());
                        head = head.next;
                }
                return head.next;
    }

    public static void main(String[] args){

    }

}

/*
 * Definition for singly-linked list.
 */
class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
  }