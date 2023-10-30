package DSA.Data_structure.queueDataStructure.problem;
// find maximum length of substring without repeating characters.
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(maxLenOfSubString(str));
    }
    public static int maxLenOfSubString(String s) {
        Deque<Character> queue = new ArrayDeque<>();
        int max = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i< s.length(); i++) {
            if(queue.isEmpty() || !set.contains(s.charAt(i))) {
                queue.offer(s.charAt(i));
                set.add(s.charAt(i));
            }else {
                while(!queue.isEmpty() && set.contains(s.charAt(i))) {
                    set.remove(queue.pollFirst());
                }
                queue.offer(s.charAt(i));
                set.add(s.charAt(i));
            }
            max = Math.max(max, queue.size());
        }
        return max;
    }

}
