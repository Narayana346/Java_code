package DSA.Algorithm.Backtracking;
import java.util.*;
// generation of parenthesis .
public class Q4 {
    public static void main(String[] args) {
        int n= 3;
        List<String> res = new ArrayList<>();
        System.out.println(generate("",0,n,0,0,res));

    }
    public static List<String> generate(String cur,int index ,int n ,int open ,int close ,List<String> store){
        if (index==2*n){
            store.add(cur);
            return store;
        }
        if (open < n){
            cur = cur+'(';
            generate(cur,index+1 ,n,open+1,close,store);
            cur = cur.substring(0,cur.length()-1);
        }
        if (close < open){
            cur = cur+')';
            generate(cur ,index+1,n,open,close+1,store);
            cur = cur.substring(0,cur.length()-1);
        }

        return store;
    }
}
