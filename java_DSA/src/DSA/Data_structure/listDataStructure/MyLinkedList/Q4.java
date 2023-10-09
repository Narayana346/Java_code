package DSA.Data_structure.listDataStructure.MyLinkedList;

import static DSA.Data_structure.listDataStructure.MyLinkedList.ListNode.*;

// delete the middle element.
public class Q4 {
    public static void main(String[] args) {
        ListNode record = new ListNode();
        int[] arr = {28 ,73, 60 ,16 ,44, 19 ,27 ,21 ,73 ,39 ,4};
        for (int item : arr) {
            record.add(item,record);
        }
        print(record);
        ListNode ans = deleteMiddle(record);
        ListNode ans2 = deleteMiddle(record);
        print(ans);
        print(ans2);

    }
    public static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static ListNode deleteMiddleItt(ListNode head) {
        if(head == null || head.next == null) return head;
        int count = 1;
        while(head.next!= null){
            head = head.next;
            count++;
        }
        int middle = (count / 2)+1;
        ListNode slow = head;{
            for(int i = 0; i < middle; i++){
                slow = slow.next;
            }
            slow.next = slow.next.next;
        }
        return head;
    }

}
