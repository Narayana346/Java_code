package DSA.Data_structure.queueDataStructure.problem;

import java.util.*;

// Get min or max from queueDataStructure in O(1) time complexity .
public class QueueWithGetMin {
    Queue<Integer> q = new LinkedList<Integer>();
    ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
    public void enqueue(int data) {
        q.offer(data);
        while(!dq.isEmpty() && dq.getLast() > data) {
            dq.pollLast();
        }
        dq.offerLast(data);
    }

    public int dequeue() {
        if(q.isEmpty()) return -1;
        int temp = q.poll();
        if(temp == dq.getFirst()){
            dq.pollFirst();
        }
        return temp;
    }
    public int getMin() {
        return dq.getFirst();
    }
    public int getMax() {
        return dq.getLast();
    }
    public static void main(String[] args) {
        QueueWithGetMin queue = new QueueWithGetMin();
        queue.enqueue(10);
        queue.enqueue(2);
        queue.enqueue(30);
        queue.enqueue(4);
        queue.enqueue(15);
        System.out.println(queue.q );
        System.out.println(queue.getMin());
        System.out.println(queue.getMax());
    }
}
