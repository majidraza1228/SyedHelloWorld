package com.coveros.demo.helloworld;
import java.util.*;

/**
 * Definition for singly-linked list.
 *  */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Solution1 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}
