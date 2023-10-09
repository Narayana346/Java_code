package DSA.Data_structure.listDataStructure.MyLinkedList;

import static DSA.Data_structure.listDataStructure.MyLinkedList.ListNode.*;

// find middle Nodes
public class Q2 {
    public static void main(String[] args) {
        ListNode record = new ListNode();
        int[] arr = {0, 5, 1, -9, 7, 3, -1, -3};
        for (int item : arr) {
            record.add(item,record);
        }
        print(record);
        ListNode ans = middleNode(record);
        System.out.println(ans.val);

    }
    public  static  ListNode middleNode(ListNode sample) {
        ListNode slow = sample;
        ListNode fast = sample;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
