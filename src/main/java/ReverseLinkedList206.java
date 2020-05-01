/*

Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
 */


public class ReverseLinkedList206 {

    public static  ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr =   head;

        while (curr != null){

            ListNode tempNode = curr.next;
            curr.next= prev;
            prev = curr;
            curr = tempNode;

        }
        return  prev;

    }


    public static void main(String[] args){

        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);


        System.out.println("List before removal of duplicates");
        llist.printList();
    }

}
