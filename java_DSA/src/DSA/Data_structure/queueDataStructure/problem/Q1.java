package DSA.Data_structure.queueDataStructure.problem;

import java.util.LinkedList;
import java.util.Queue;

// The first non-repeating character in stream .
public class Q1 {
    public static void main(String[] args) {
        String str = "abacbcbd";
        System.out.println(firstNonRepeatingCharacter(str));

    }
    public static String firstNonRepeatingCharacter(String A) {
        int[] freq = new int[26];
        StringBuilder res = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < A.length(); i++) {
            queue.offer(A.charAt(i));
            freq[A.charAt(i) - 'a']++;
            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.poll();
            }
            if (queue.isEmpty()) {
                res.append('#');
            }else {
                res.append(queue.peek());
            }
        }

        return res.toString();
    }
}
