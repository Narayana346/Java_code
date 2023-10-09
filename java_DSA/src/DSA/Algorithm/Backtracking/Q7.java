package DSA.Algorithm.Backtracking;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> res = new ArrayList<>();
        helper(str,"",res,0);
        Collections.sort(res);
        System.out.println(res);

    }
    public static void helper(String str , String permit ,List<String> res ,int start){
        if( str.length() == 0){
            if (!res.contains(permit)) {
                res.add(permit);
            }
            return;
        }
        for(int i = 0 ;i<str.length();i++){
            char cur = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            helper(newStr , permit+cur,res ,start+1);
        }

    }
}
