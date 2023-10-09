package queueDataStructure.Priority_Queue;

import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        System.out.println("enter the how many testCase :");
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- !=0){
            System.out.println("enter the how many element in list - ");
            int numberOfelement = sc.nextInt();
            System.out.println("enter the how many number get top element");
            int NumberOfTopElement = sc.nextInt();
            int A[] = new int[numberOfelement];
            for (int i = 0; i< numberOfelement; i++){
                System.out.println("enter the "+(i+1)+"st element");
                A[i] = sc.nextInt();
            }
            PriorityQueue<Integer> pq = new PriorityQueue <>();
            for (int i = 0; i< numberOfelement; i++){
                if (i< NumberOfTopElement){
                    pq.add(A[i]);
                }else{
                    if (pq.peek() <A[i]){
                        pq.poll();
                        pq.add(A[i]);
                    }
                }
            }
            ArrayList<Integer> ans = new ArrayList <>(pq);
            Collections.sort(ans,Collections.reverseOrder());
            System.out.print("getOutput ---> ");
            for (int x:ans){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
