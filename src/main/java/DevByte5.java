/*

1->2->3->1 -> true (3 points back to 1)
1->2->3 -> false
1->1 true (1 points to itself)
 */

public class DevByte5 {

    public static boolean containsCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public  static void main(String[] args){

        ListNode testNode = new ListNode(1);
        testNode.next= new ListNode(2);
       testNode.next.next = new ListNode(4);
       // testNode.next.next.next = new ListNode(1);

        System.out.print(containsCycle(testNode));

    }
}
