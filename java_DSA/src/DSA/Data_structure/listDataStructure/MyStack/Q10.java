package DSA.Data_structure.listDataStructure.MyStack;
// longest parentheses validation.
import java.util.Stack;

public class Q10 {
    public static void main(String[] args) {
        String s = "()))((";
        System.out.println(longestValidParenthesis(s));

    }
    public static int longestValidParenthesis(String s){
        Stack<Integer> stack = new Stack<Integer>();
        int maxLength = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push(i);
            }else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }
}
