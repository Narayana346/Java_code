package DSA.Data_structure.listDataStructure.MyStack;

import java.util.ArrayDeque;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1 ,1 ,1 ,1 ,1};
        int[] result = stockSpan(arr,arr.length);
        int[] result2 = bruteForce(arr,arr.length);
        for (int item: result) {
            System.out.print(item+" ");
        }
        System.out.println();
        for (int item: result2){
            System.out.print(item+" ");
        }
    }
    static int[] stockSpan(int[] arr , int len){
        int[] res = new int[len];
        res[0] = 1;
        ArrayDeque<Integer> stack  = new ArrayDeque<Integer>();
        stack.push(0);
        for(int i=1;i<len;i++){
            while (!stack.isEmpty()){
                int top = stack.peek();
                if(arr[top] > arr[i]){
                    break;
                }else{
                    stack.pop();
                }
            }

            if(stack.isEmpty()){
                res[i] = i+1;
            }else{
                res[i] = i-stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
    static int[] bruteForce(int[] arr, int len){
        int[] res = new int[len];
        res[0] = 1;
        for(int i=1;i<len;i++){
            int j = i;
            while (j > 0 && arr[j] <= arr[i] ){
                j--;
            }
            res[i] = i-j;
        }
        return res;
    }
}
