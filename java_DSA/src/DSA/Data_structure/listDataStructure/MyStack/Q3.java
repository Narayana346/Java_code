package DSA.Data_structure.listDataStructure.MyStack;

import java.util.ArrayDeque;

//infix,prefix and postfix Expressions.
public class Q3 {
    public static void main(String[] args) {
        String[] postfix = {"3", "4" ,"-", "5", "-"};
        int res = evaluatePostfix(postfix);
        System.out.println(res);

    }
    public static int evaluatePostfix(String[] str){
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for (String token : str) {
            if (isOperator(token)){
                int first = stack.pop();
                int second = stack.pop();
                int result = 0;
                switch (token){
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                    case "^":
                        result = (int) Math.pow(first, second);
                        break;
                }
                stack.push(Math.abs(result));
            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public static boolean isOperator(String str){
        return str.equals("+") || str.equals("-")|| str.equals("*") || str.equals("/") || str.equals("^");
    }
}
