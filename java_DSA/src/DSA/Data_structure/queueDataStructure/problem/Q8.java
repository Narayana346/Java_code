package DSA.Data_structure.queueDataStructure.problem;
import java.util.*;
// generate the binary number occurrence 1 to N number .
public class Q8 {
    public static void main(String[] args) {
        System.out.println(generateBinary(5));
    }
    public static ArrayList<String> generateBinary(int N){
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("1");
        ArrayList<String> ans = new ArrayList<>();
        while(N > 0){
            String s1 = queue.peek();
            queue.poll();
            ans.add(s1);
            String s2 = s1;
            queue.offer(s1+"0");
            queue.offer(s2+"1");
            N--;
        }
        return ans;
    }
}
