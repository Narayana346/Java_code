package DSA.Data_structure.queueDataStructure.problem;

import java.util.*;

//Tickets Counter
public class Q6 {
    public static void main(String[] args) {
    System.out.println(distributeTicket(9 ,3));
    }
    public static int distributeTicket(int N,int K) {
        //You can code here
        Deque<Integer> queue = new ArrayDeque<Integer>();
        boolean check = false;
        for(int i = 1; i <= N; i++){
            queue.offer(i);
        }
        while(queue.size() > K) {
            int i = 1;
            int j = 1;
            int len1=queue.size();
            while (len1 > K && i <= K){
                queue.pollFirst();
                check = true;
                i++;
            }
            int len2 = queue.size();
            while (len2 > K && j <= K){
                queue.pollLast();
                check = false;
                j++;
            }
        }
        if(check){
            return queue.peekFirst();
        }
        return queue.peekLast();
    }
}
