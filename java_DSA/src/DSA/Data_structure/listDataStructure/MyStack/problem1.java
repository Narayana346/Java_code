package DSA.Data_structure.listDataStructure.MyStack;

import java.util.Scanner;
import java.util.Stack;

public class problem1 {
    public static void main(String[] args) {
        System.out.println("enter the bracket only");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        if(inputString.isEmpty() || inputString.length() % 2 != 0 ){
            System.out.println("invalid");
            return;
        }
        Stack<Character>  datSet= new Stack<>();
      char cp = datSet.push(inputString.charAt(0));
//      System.out.println(cp);
        for (int i = 1; i < inputString.length(); i++) {
            char rf = inputString.charAt(i);
            if (datSet.empty()){
                datSet.push(rf);
            }
           else if (check(cp,rf)){
                datSet.pop();
            }else{
                datSet.push(rf);
            }
           if (!datSet.empty()) {
               cp = datSet.peek();
           }
        }
        if(datSet.empty()){
            System.out.print("valid");
        }else {
            System.out.print("invalid");
        }
    }

    static boolean check(char cp, char rf) {
        boolean check = false;
        if (cp == '[' && rf == ']') {
            return check = true;
        }
        if (cp == '{' && rf == '}') {
            return check = true;
        }
        if (cp == '(' && rf == ')') {
            return check = true;
        }
        if (cp == '"' && rf == '"') {
            return check = true;
        }

        return check;
    }
}