package queueDataStructure.Priority_Queue;

    import java.util.Deque;
import java.util.LinkedList;

//sliding Window maximum ----> solve both PQ and Deque
public class problem2 {
    public static void main(String[] args) {
         int input[] = {4,3,1,2,5,3,4,7,1,9};
        slidingWindow slidingWindow = new slidingWindow();
     int ans[] =  slidingWindow.maxSlidingWindow(input,4);
        for (int x :
                ans) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
   static class slidingWindow{
        public int[] maxSlidingWindow( int[] Array, int k){
            int length = Array.length;
            if (length<=1){
                return Array;
            }
            Deque<Integer> dq = new LinkedList <>();
            int ans[] = new int[length-k+1];
            int index =0 ;
            for (;index<k;index++){
                while (!dq.isEmpty() && Array[dq.peekLast()] <= Array[index]){
                    dq.removeLast();
                }
                dq.addLast(index);
            }
            for (;index<length;index++){
                ans[index-k] =Array[dq.peekFirst()];
                while (!dq.isEmpty() && dq.peekFirst() <= index-k){
                    dq.removeFirst();
                }
                while (!dq.isEmpty() && Array[dq.peekLast()] <= Array[index]){
                    dq.removeLast();
                }
                dq.addLast(index);
            }
            ans[index-k]=Array[dq.peekFirst()];
            return ans;
        }
    }
}
