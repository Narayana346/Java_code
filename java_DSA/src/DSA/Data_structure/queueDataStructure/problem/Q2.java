package DSA.Data_structure.queueDataStructure.problem;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

// reverse the queue in kth position ..
public class Q2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 10;i <= 50;i +=10){
            queue.offer(i);
        }
        Queue<Integer> res = reverse(queue,3);
        System.out.println(res);
    }
    public static Queue<Integer> reverse(Queue<Integer> queue, int k) {
        if(k <= 1) return queue;
        int size = queue.size();
        ArrayDeque<Integer> store = new ArrayDeque<Integer>();

        for (int i = 0; i < k; i++) {
            store.push(queue.poll());
        }
        while(!store.isEmpty()) {
            queue.offer(store.pop());
        }
        int rotate = size-k;
        while(rotate >= 1){
            queue.offer(queue.poll());
            rotate--;
        }
        return queue;
    }

}
