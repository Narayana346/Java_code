package DSA.Data_structure.queueDataStructure.Array_Deque;

import java.util.ArrayDeque;

public class main1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1 = new ArrayDeque <>();
        customDeque<Integer> cd = new customDeque <>();
        System.out.println("used in arrayDeque");
        a1.addFirst(12);
        a1.addFirst(13);
        System.out.println(a1);
        System.out.println(a1.pop());
        System.out.println(a1.peek());
        System.out.println("used in stack ");
        ArrayDeque<Integer> s1 = new ArrayDeque <>();
        s1.push(12);
        s1.push(13);
        s1.push(14);
        System.out.println(s1);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println("use in customDeque");
        cd.addToHead(15);
        cd.addToHead(16);
        cd.addToHead(17);
        System.out.println(cd);
        cd.removeLast();
        cd.removeLast();
        System.out.println(cd);
    }
}
