package DSA.Data_structure.mapDataStructure;

import java.util.*;
// ANAGRAM OF STRING
public class PROBLEM1 {
    public static void main(String[] args) {
        Map<String, List<String> > map = new HashMap <>();
        String[] str = {"cat","dog","god","tac","move","evom"};
        for (String s : str){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(!map.containsKey(sorted)){
                map.put(sorted,new LinkedList <>());
            }
                    map.get(sorted).add(s);
        }
        System.out.println(map.values());
        System.out.println(map);
    }
}
