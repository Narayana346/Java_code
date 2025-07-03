package DSA.Algorithm.sliding_window;
//Given a string s, find the length of the longest substring without duplicate characters.

import java.util.HashMap;
import java.util.Map;

public class A2 {
    public static void main(String[] args) {
        String input = " ";
        System.out.print("output is : "+findLongestSubstringWithNonDuplicateCharacter(input));

    }
    private static int findLongestSubstringWithNonDuplicateCharacter(String s){
        Map<Character,Integer> map = new HashMap<>();
        int result = 0;
        int start = 0;
        if (s.isEmpty()){
            return 0;
        }
        for(int end = 0 ; end < s.length(); end++){
            if(map.containsKey(s.charAt(end))){
                /* When a repeated character is found (i.e., it already exists in the map),
                we must move the start pointer just after the last occurrence of that character
                to ensure that the current window remains valid (i.e., contains no repeated characters). */
                start = Math.max(map.get(s.charAt(end))+1,start);
            }
            map.put(s.charAt(end),end);
            result = Math.max(result,(end-start)+1);
        }
        return result;
    }
}
