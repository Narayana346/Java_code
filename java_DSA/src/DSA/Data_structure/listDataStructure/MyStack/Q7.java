package DSA.Data_structure.listDataStructure.MyStack;

import java.util.*;
//remove duplicate latter
public class Q7 {
    public static void main(String[] args) {
      String str = "aaccbbde";
      System.out.println(removeDuplicateLetters(str));

    }
    public static String removeDuplicateLetters(String s) {
        //You can code here
        Stack<Character> stack = new Stack<>();
        int[] lastOccurrence = new int[26];
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen[c - 'a']) {
                while (!stack.isEmpty() &&
                        c < stack.peek() &&
                        i < lastOccurrence[stack.peek() - 'a']) {
                    seen[stack.pop() - 'a'] = false;
                }
                stack.push(c);
                seen[c - 'a'] = true;
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();

    }
}
