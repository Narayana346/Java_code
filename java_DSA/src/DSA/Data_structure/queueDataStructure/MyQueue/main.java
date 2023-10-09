package DSA.Data_structure.queueDataStructure.MyQueue;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new LinkedList<>();
        customQueue <Integer> mq = new customQueue <>();

        mq.enqueue(12);
        mq.enqueue(13);
        mq.enqueue(14);
        mq.enqueue(15);
        System.out.println(mq);
        System.out.print(mq.dequeue()+" ");
        System.out.print(mq.dequeue()+" ");
        System.out.print(mq.dequeue()+" ");
        System.out.println(mq.dequeue()+" ");

        System.out.println(q1.poll());
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
    System.out.println(q);
    System.out.println(q.remove());
    System.out.println(q.remove());

    }
}
