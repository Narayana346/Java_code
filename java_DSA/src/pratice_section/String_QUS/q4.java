package pratice_section.String_QUS;

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] characters = {'a', 'b', 'c','d', 'e', 'f', 'g', 'h', 'i'
                            , 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                            'r', 's','t', 'u','v','w','x','y','z'};
        int[] occur = new int[26];
        for (int i = 0; i < input.length(); i++) {
            occur[input.charAt(i) - 'a']++;
        }
        for(int i = 0; i < input.length();i++) {
            if(occur[input.charAt(i) - 'a'] > 0){
                System.out.println( characters[input.charAt(i)-'a'] +" --> "+
                        occur[input.charAt(i)-'a']);
            }
        }

    }
}
