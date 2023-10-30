package DSA.Data_structure.listDataStructure.MyStack;

import java.util.ArrayDeque;

// Redundant Braces .
public class Q8 {
    public static void main(String[] args) {
        String str = "(a+(a+b))";
        System.out.println(hasRedundantBraces(str));

    }
    public static boolean hasRedundantBraces(String s){
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        boolean res = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' ||
                    s.charAt(i) == '-' ||
                    s.charAt(i) == '*' || s.charAt(i) == '/') {

                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.peek() == '(') res = true;
                while(stack.peek() == '+'||
                        stack.peek() == '-'||
                        stack.peek() == '*'||
                        stack.peek() == '/') {
                    stack.pop();
                }
                stack.pop();
            }
        }
        return res;
    }
}
