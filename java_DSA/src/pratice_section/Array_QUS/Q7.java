package pratice_section.Array_QUS;
//minimum difference .
import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = {12,9,8,2,11};
        boolean add = true;
        boolean  even = false;
        helper(ans,arr);
        System.out.println();
        System.out.println(ans);

    }
    public static void helper(List<List<Integer>> ans , int[] arr){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1;i< arr.length;i++){
            if (arr[i]- arr[i-1] < min) min = arr[i]- arr[i-1];
        }
        for (int i = 1; i< arr.length;i++){
            if (min == arr[i]-arr[i-1]){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }

    }
}
