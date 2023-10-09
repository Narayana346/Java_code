package DSA.Data_structure.listDataStructure.MyStack;
import java.util.*;
//Reverse String using stack.
public class Q2 {
    public static void main(String[] args) {
        char[] input = "abcdef".toCharArray();
        System.out.println(Arrays.toString(reverseString(input)));
    }
    public static char[] reverseString(char[] s) {
        //You can code here
        Stack<Character> store = new Stack<>();
        for(int i = 0;i < s.length;i++){
            store.push(s[i]);
        }
        char[] result = new char[store.size()];
        for(int i = 0;i < s.length;i++){
            result[i] = store.pop();
        }
        return result;

    }
}
