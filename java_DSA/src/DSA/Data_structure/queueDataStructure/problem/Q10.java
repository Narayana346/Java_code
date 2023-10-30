package DSA.Data_structure.queueDataStructure.problem;
// Continuous Sub-arrays ...
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(brutContinuousSubarrays(nums));
        System.out.println(continuousSubarrays(nums));
    }

    public static long brutContinuousSubarrays(int[] nums) {
        //You can code here
        // brute force algorithm...
        long sub_count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= 2 && Math.abs(nums[i] - nums[j]) >= 0) {
                    sub_count = sub_count+1 ;
                    System.out.println(nums[i]+"-->" +nums[j]);
                }

            }
        }
        return sub_count;
    }
    public static int continuousSubarrays(int[] nums) {
        int count = 0;
        ArrayDeque<Integer> max = new ArrayDeque<Integer>();
        ArrayDeque<Integer> min = new ArrayDeque<Integer>();
        int left = 0, right =0 , len = nums.length;
        for(;right<len;right++) {
            while(!min.isEmpty() && min.getLast() > nums[right]){
                min.pollLast();
            }
            min.offerLast(nums[right]);
            while (!max.isEmpty() && max.getLast() < nums[right]){
                max.pollLast();
            }
            max.offerLast(nums[right]);

            while(max.getFirst() - min.getFirst() > 2){
                if(min.getFirst() == nums[left]){
                    min.pollFirst();
                }
                if(max.getFirst() == nums[left]){
                    max.pollFirst();
                }
                left++;
            }
            count  += (right-left+1);
        }
        return count;
    }
}
