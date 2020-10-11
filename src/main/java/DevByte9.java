public class DevByte9 {
    public static ListNode removeValue(ListNode head, int val) {
        while(head != null && head.val == val) {
            head = head.next;
        }

        ListNode dummy = head;
        while(dummy != null) {
            if(dummy.next != null && dummy.next.val == val) {
                dummy.next = dummy.next.next;
            } else {
                dummy = dummy.next;
            }
        }

        return head;
    }

    public static void main(String[] args){

        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        ListNode dummy = new ListNode(3);
        dummy =removeValue(head,1);

        while (dummy !=null){
            System.out.print(dummy.val+"-->");
           dummy= dummy.next;
        }



    }



}
