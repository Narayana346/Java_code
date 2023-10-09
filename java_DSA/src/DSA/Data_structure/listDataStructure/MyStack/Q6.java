package DSA.Data_structure.listDataStructure.MyStack;
// Largest Rectangle in Histograms.

import java.util.ArrayDeque;

public class Q6 {
    public static void main(String[] args) {
        int[] heights = {6 ,4 ,1 ,9};
        int n = heights.length;
        int[] ns = nextSmaller(heights);
        int[] ps = previousSmaller(heights);
        int max = 0;
        for(int i = 0 ; i < n;i++){
            int cur = (ns[i] - ps[i]-1) * heights[i];
            max = Math.max(cur,max);
        }

        System.out.println("Max: " + max);

    }
    public static int[] previousSmaller(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peekLast()] >= arr[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty()? -1 : arr[stack.peek()];
            stack.push(i);
        }
        return ans;
    }
    public static int[] nextSmaller(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty()? n : stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
