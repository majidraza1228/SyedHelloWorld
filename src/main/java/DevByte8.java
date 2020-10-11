import org.w3c.dom.NodeList;

public class DevByte8 {


    public static ListNode findMiddleElement(ListNode head) {

       int count=0;
       ListNode dummy = head;

       while ( dummy!=null){

           dummy = dummy.next;
           count++;
       }

      for (int i=0;i < count/2; i++){

            head = head.next;
        }
        return head;
    }

    public static void main(String[] args){

        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);
        System.out.println( "Middle of Node is  ---->"+ findMiddleElement(test).val);
    }



}
