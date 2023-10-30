package DSA.Data_structure.listDataStructure.MyStack;

import java.util.ArrayDeque;
import java.util.Stack;

// remove K digits
public class Q9 {
    public static void main(String[] args) {
        String num = "987654321098765432109876543210987654321098765432109876543210";
        System.out.println(removeKdigits(num, 15));

    }
    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(char digit :num.toCharArray()){
            while (k > 0 && !stack.isEmpty() && stack.peek() > digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0){
            stack.pop();
            k--;
        }
        while (!stack.isEmpty() && stack.get(0) == '0'){
            stack.remove(0);
        }
        if (stack.isEmpty()){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        for (char digit : stack){
            res.append(digit);
        }
        return res.toString();
    }
}
