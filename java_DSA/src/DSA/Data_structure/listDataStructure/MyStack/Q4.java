package DSA.Data_structure.listDataStructure.MyStack;

import java.util.ArrayDeque;
import java.util.Stack;

// conversion infix to prefix Expression.
public class Q4 {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch == 'a');
        String Expression = "a * ( d - e + f ) - g * h";
        System.out.println(infixToPostfix(Expression));
    }
    public static String infixToPostfix(String str){
        String tokens[] = str.split(" ");
        ArrayDeque<String> stack = new ArrayDeque<String>();
        StringBuilder res = new StringBuilder();
        for (String token :tokens){
            if(token.equals("(")){
                stack.push(token);
            }else if(isOperator(token)){
                while (!stack.isEmpty() && president(stack.peek()) >= president(token)){
                    String temp = stack.pop();
                    res.append(temp);
                }
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")){
                    String temp = stack.pop();
                    res.append(temp);
                }
                stack.pop();
            }else {
                res.append(token);
            }
        }
        while (!stack.isEmpty()){
            String temp = stack.pop();
            res.append(temp);
        }

        return res.toString();
    }
    static boolean isOperator(String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("^");
    }
    static int president(String str){
        switch (str){
            case "^":
                return 3;
            case "*":
            case "/":
                return 2;
            case "+":
            case "-":
                return 1;
            default: return -1;
        }
    }
}
