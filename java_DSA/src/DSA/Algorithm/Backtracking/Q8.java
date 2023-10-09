package DSA.Algorithm.Backtracking;
import java.util.*;

// subsequence of array.
public class Q8 {
    public static void main(String[] args) {
    ArrayList<Integer> nums = new
            ArrayList<>();
    nums.add(1);
    nums.add(1);
    nums.add(1);
        int[] arr = new int[nums.size()];
        for(int i = 0 ;i<nums.size();i++){
            arr[i] = nums.get(i);
        }
        for (int item:arr){
            System.out.print(item+" ");
        }
        System.out.println();

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        helper(arr,res,0,cur);
        System.out.println(res);
    }


    static  void helper(int a[],ArrayList<ArrayList<Integer>> ans , int index,
                        ArrayList<Integer> cur){

            ArrayList<Integer> curCopy = new ArrayList<>(cur);
            ans.add(curCopy);

        for (int i = index ;i < a.length;i++){
            if (i > index && a[i] == a[i-1]) continue;
            cur.add(a[i]);
            helper(a,ans,i+1,cur);
            cur.remove(cur.size()-1);
        }
    }
}
