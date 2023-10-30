package DSA.Data_structure.listDataStructure.MyStack;
//Shortest Unsorted Continuous sub-array .
import java.util.Stack;
public class Q11 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 3, 5};
        System.out.println(findUnsortedSubarray(nums));
    }
    public static int findUnsortedSubarray(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int start = nums.length;
        int end = 0;

        // Find the start index of the unsorted subarray
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] < nums[stack.peek()]) {
                start = Math.min(start, stack.pop());
            }
            stack.push(i);
        }

        stack.clear(); // Clear the stack to reuse it

        // Find the end index of the unsorted subarray
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                end = Math.max(end, stack.pop());
            }
            stack.push(i);
        }

        return end - start > 0 ? end - start + 1 : 0;
    }

}
