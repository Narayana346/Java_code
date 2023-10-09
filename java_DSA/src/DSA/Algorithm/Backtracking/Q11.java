package DSA.Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.List;

// palindromic partitioning .
public class Q11 {
    public static void main(String[] args) {
        String s = "abbace";
        List<List<String>> ans = PalindromePartitioning(s);
               for (List<String> list:ans){
                   for (String str:list){
                       System.out.print(str+" ");
                   }
                   System.out.println();
               }
               s.equals("abbace");
    }
    static List<List<String>> PalindromePartitioning(String s){
        List<List<String>> ans = new ArrayList<>();
        palindromicHelper(s,ans,0,new ArrayList<>());
        return ans;
    }
    static boolean isPalindrome(String str,int l,int r){
        while (l<=r){
            if (str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    static void palindromicHelper(String s,List<List<String>> ans,int index,List<String> cur){
        if (index == s.length()){
            List<String> copyCur = new ArrayList<>(cur);
            ans.add(copyCur);
            return;
        }
        for (int i = index;i < s.length();i++){
            if (isPalindrome(s,index,i)){
                cur.add(s.substring(index,i+1));
                palindromicHelper(s,ans,i+1,cur);
                cur.remove(cur.size()-1); //backtracking
            }

        }
    }
}
