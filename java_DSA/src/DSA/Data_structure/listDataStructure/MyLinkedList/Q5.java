package DSA.Data_structure.listDataStructure.MyLinkedList;

import static DSA.Data_structure.listDataStructure.MyLinkedList.ListNode.print;

public class Q5 {
    public static void main(String[] args) {
        ListNode record = new ListNode();
        int[] arr = {50080 ,46100 ,19082 ,8335 ,16158};
        for (int item : arr) {
            record.add(item,record);
        }
        print(reverseKGroup(record , 3));

    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        //You can code here
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        int count = 0;
        while (count < k && cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;

        }
        if(next != null){
            head.next = reverseKGroup(next ,k);
        }
            return prev;

    }
    public static ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newSubhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newSubhead;
    }
}
