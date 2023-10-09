package DSA.Data_structure.listDataStructure.MyLinkedList;

import static DSA.Data_structure.listDataStructure.MyLinkedList.ListNode.*;

// add two numbers
public class Q3 {
    public static void main(String[] args) {
        ListNode record1 = new ListNode();
        ListNode record2 = new ListNode();
        int[] num1 = {5,5,5};
        int[] num2 = {5,5,5};
        for (int item : num1) {
            record1.add(item,record1);
        }
        for (int item : num2) {
            record2.add(item,record2);
        }
        print(record1);
        print(record2);
        ListNode ans = addTwoNumbers(record1,record2);
        print(ans);
    }
    public static ListNode addTwoNumbers(ListNode A, ListNode B) {
        //You can code here
        ListNode r1 = reverse(A);
        ListNode r2 = reverse(B);
        int carry = 0;
        ListNode ans = null;
        ListNode temp = null;
        while(r1 != null || r2 != null || carry != 0){
            int sum = carry;
            if(r1 != null){
                sum += r1.val;
                r1 = r1.next;
            }
            if(r2 != null){
                sum += r2.val;
                r2 = r2.next;
            }
            int digit = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(digit);
            if(ans == null){
                ans = temp = newNode;
            }else{
                temp.next = newNode;
                temp = newNode;
            }
        }
        ans = reverse(ans);
        return ans;



    }
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode cur = head.next;
        head.next = null;
        while(cur != null){
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    }
}
