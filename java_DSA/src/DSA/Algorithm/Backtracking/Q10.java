package DSA.Algorithm.Backtracking;
// smart keypad problem.
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        String input = "23";
        List<String> res = smartKeypad(input);
        for (String item :
                res) {
            System.out.print(item +" ");
        }
        System.out.println();
        List<String> recursion = smartKeypadRecursion(input); ;
        for (String item :
                recursion) {
            System.out.print(item +" ");
        }



    }
    static List<String> smartKeypad(String input){
        String a[] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>  ans = new ArrayList<>();
        smartKeypadHelper(input,0,ans,a,"");
        return ans;
    }
    static List<String> smartKeypadRecursion(String input){
        String a[] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>  ans = new ArrayList<>();
        recursionApproach(input,0,ans,a,"");
        return ans;
    }
    static void smartKeypadHelper(String input,int index
            ,List<String> ans,String a[],String cur) {

        if(index == input.length()){
            ans.add(cur);
            return;
        }
        int indexOfButton = input.charAt(index)-'0';
        String buttonString = a[indexOfButton];
        for (int i = 0;i<buttonString.length();i++){
            cur = cur + buttonString.charAt(i);
            smartKeypadHelper(input,index+1,ans,a,cur);
            cur = cur.substring(0,cur.length()-1); //backtracking
        }
    }

    static void recursionApproach(String input,int index
            ,List<String> ans,String a[],String cur){
        if(index == input.length()){
            ans.add(cur);
            return;
        }
        int indexOfButton = input.charAt(index)-'0';
        String buttonString = a[indexOfButton];
        for (int i = 0;i<buttonString.length();i++){
            recursionApproach(input,index+1,ans,a,cur+buttonString.charAt(i));
        }
    }
}
