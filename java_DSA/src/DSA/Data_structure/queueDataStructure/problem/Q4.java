package DSA.Data_structure.queueDataStructure.problem;

import java.util.*;

// interchange elements of stack and queue without changing order .
/*
* push m ele from queue to stack.
* push all elements from stack to queue.
* push m ele from queue to stack.
* push n ele from queue to stack.
* push n ele from stack to queue.
* */
public class Q4 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        q.offer(8);
        q.offer(7);
        q.offer(6);
        q.offer(5);
        int m = st.size();
        int n = q.size();
        System.out.println(st);
        System.out.println(q);

        for(int i = 0; i < m;i++){
            q.offer(st.pop());
        }
        for(int i = 0; i < m+n;i++){
            st.push(q.poll());
        }
       for(int i = 0; i < m;i++){
           q.offer(st.pop());
       }
        System.out.println(st);
        System.out.println(q);


    }
}
