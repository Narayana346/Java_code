package pratice_section.Array_QUS;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = {12,9,8,2,11,5,4};
        ans = minimumDiff(arr);
        System.out.println(ans);

    }
    static List<List<Integer>> minimumDiff(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 1;i<n;i++){
            min = Math.min(min,arr[i]- arr[i-1]);
        }
        for (int i = 1;i<n;i++){
            if (arr[i]-arr[i-1] == min){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
}
