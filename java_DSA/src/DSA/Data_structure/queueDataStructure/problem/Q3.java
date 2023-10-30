package DSA.Data_structure.queueDataStructure.problem;
import java.util.*;
// finding negative numbers of given window..
public class Q3 {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(firstNegative(arr, arr.length, k));
    }
    public static List<Integer> firstNegative(int[] arr, int n, int k)
    {
        //You can code here
        List<Integer> result = new ArrayList<Integer>();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int i = 0;
        while(i<k){
            if(arr[i]< 0){
                deque.offer(arr[i]);
            }
            i++;
        }
        while(i<n){
            if(deque.isEmpty()){
                result.add(0);
            }else{
                result.add(deque.peekFirst());
            }
            if(!deque.isEmpty()&&deque.peekFirst() == arr[i-k]){
                deque.pollFirst();
            }
            if(arr[i]< 0){
                deque.offer(arr[i]);
            }
            i++;
        }
        result.add(deque.isEmpty()?0:deque.peekFirst());
        return result;
    }
}
