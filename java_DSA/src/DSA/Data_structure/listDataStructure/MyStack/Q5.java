package DSA.Data_structure.listDataStructure.MyStack;

import java.util.ArrayDeque;

// find the previous smaller element ...
public class Q5 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 7, 8, 1, 9};
        int[] smallerInLeft = smallerInLeft(arr);
        int[] smallerInRight = smallerInRight(arr);
        for(int item: smallerInLeft) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (int item: smallerInRight) {
            System.out.print(item + " ");
        }

    }
    public static int[] smallerInLeft(int[] arr){
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
    public static int[] smallerInRight(int[] arr){
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
