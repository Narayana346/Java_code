package DSA.Data_structure.listDataStructure.MyLinkedList;


import static DSA.Data_structure.listDataStructure.MyLinkedList.ListNode.*;

// record ListNode.
public class Q1 {
    public static void main(String[] args) {
        ListNode record = new ListNode();
        ListNode start = record;
        int[] arr = {0, 5, 1, -9, 7, 3, -1, -3};
        for (int item : arr) {
            record.add(item ,record);
        }
        print(record);
        ListNode ans = reverse(reorderList(record));
        print(reverse(ans));


    }
    public static ListNode reorderList(ListNode head) {
        //You can code here
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode l2 = reverse(slow);
        ListNode l1 = head;

        while(true){
            if(l1 == l2){
                l1.next = null;
                break;
            }
            if(l2.next == null){
                l1.next = l2;
                l2.next = null;
                break;
            }
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;

            l1.next = l2;
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }
        return head;
    }

    public static   ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode cur = head;
        ListNode nextNode;
        while(cur != null){
            nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    }
}
