package DSA.Data_structure.listDataStructure.MyLinkedList;

import static DSA.Data_structure.listDataStructure.MyLinkedList.ListNode.print;

public class Q7 {
    public static void main(String[] args) {
        ListNode record1 = new ListNode();
        ListNode record2 = new ListNode();
        int[] l1 = {-1,3,4};
        int[] l2 = {-1,2,4};
        for (int item: l1) {
            record1.add(item,record1);
        }
        for (int item: l2) {
            record2.add(item,record2);
        }
        print(mergeTwoList(record1,record2));

    }
    public static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if (l1.val < l2.val) {

            l1.next = mergeTwoList(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoList(l1,l2.next);
            return l2;
        }
    }

}
