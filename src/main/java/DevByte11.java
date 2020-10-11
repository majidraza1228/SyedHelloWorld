/*

1->2->3->null, return a reference to the node that contains 3 which points to a list that looks like the following: 3->2->1->null
7->15->9->2->null, return a reference to the node that contains 2 which points to a list that looks like the following: 2->9->15->7->null
1->null, return a reference to the node that contains 1 which points to a list that looks like the following: 1->null
 */


public class DevByte11 {


    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;

        while (head != null) {

            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }


        return previous;


    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);


        ListNode dummy = new ListNode(6);
        dummy = reverseList(head1);

        while (dummy != null) {
            System.out.print(dummy.val + "-->");
            dummy = dummy.next;

        }

    }
}
