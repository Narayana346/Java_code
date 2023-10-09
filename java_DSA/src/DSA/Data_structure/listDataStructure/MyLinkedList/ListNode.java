package DSA.Data_structure.listDataStructure.MyLinkedList;


public class ListNode {
    int val;
    ListNode next;
    ListNode() {
        val = 0;
        next = null;
    }
    ListNode(int val) { this.val = val; next = null; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void print(ListNode node) {
        ListNode current = node;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println();
    }
    public void add(int data ,ListNode node) {
        ListNode toAdd = new ListNode(data);
        if (node.val == 0) {
            node.val = data;
            node.next = null;
        }else {
            while (node.next != null) {
                node = node.next;
            }
            node.next = toAdd;
        }
    }
}
