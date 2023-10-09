package DSA.Data_structure.queueDataStructure;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q);
        q.poll();
        System.out.println(q.peek());
        System.out.println(q);

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(70);
        pq.add(80);
        pq.add(40);
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
