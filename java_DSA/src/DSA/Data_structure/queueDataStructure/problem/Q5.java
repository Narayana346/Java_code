package DSA.Data_structure.queueDataStructure.problem;

import java.util.*;
// sliding window maximum..
public class Q5 {
    public static void main(String[] args) {
        int[] arr = {12 ,72 ,7 ,-35 ,13 ,31 ,61 ,38 ,3};
        int k = 7;
        System.out.println(slidingWindowMax(arr, k));
    }
    public static  List<Integer> slidingWindowMax(int[] nums, int k){
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        int n = nums.length;
        List<Integer> res = new ArrayList<Integer>();
        int i = 0;
        while(i < k){
            while (!dq.isEmpty() && dq.getLast() < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(nums[i]);
            i++;
        }
        for(;i<n;i++){
            res.add(dq.peekFirst());
            if(nums[i-k] == dq.peekFirst()){
                dq.pollFirst();
            }
            while (!dq.isEmpty() && dq.getLast() < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(nums[i]);
        }
        res.add(dq.poll());
        return res;
    }
    
}
