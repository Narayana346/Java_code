package DSA.Data_structure.listDataStructure.MyLinkedList;

import static DSA.Data_structure.listDataStructure.MyLinkedList.ListNode.print;

public class Q6 {
    public static void main(String[] args) {
        ListNode record = new ListNode();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int item : arr) {
            record.add(item,record);
        }
        print(record);
        print(removeNthFromEnd(record , 6));
    }
    public static ListNode removeNthFromEnd(ListNode A , int B) {
        //You can code here
        ListNode result = A;
        if (A == null) {
            return A;
        }
        int count = 1;
        ListNode head = A;
        while (A.next != null) {
            A = A.next;
            count++;
        }
        System.out.println(count);
        if (count <= B) {
            return result.next;
        }
        for (int i = 1; i < count-B; i++) {
            head = head.next;
        }
        head.next = head.next.next;

        return result;
    }

}
