package DSA.Data_structure.queueDataStructure.problem;

import java.util.*;
// Minimum Number of K Consecutive .
public class Q9 {
    public static void main(String[] args) {
        int[] num = {0,0,0,1,0,1,1,0};
        int k = 3;
        System.out.println(flipBits(num, k));
    }
    public static int flipBits (int[] nums, int k){

        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        int n = nums.length;
        for(int i = 0; i < n;i++){
            if((queue.size() & 1) != 0){
                nums[i] = nums[i] ^ 1; //flip the bits...
            }
            if(nums[i] == 0){
                if(i+ k > n) {
                    return -1;
                }
                count++;
                queue.offer(i+ k -1);
            }
            if (!queue.isEmpty() && queue.peek() == i){
                queue.poll();
            }

        }
        return count;
    }
}
