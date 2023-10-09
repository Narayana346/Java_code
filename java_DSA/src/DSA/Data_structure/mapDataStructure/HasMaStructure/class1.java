package DSA.Data_structure.mapDataStructure.HasMaStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class class1 {
    public static void main(String[] args) {
        Map<String,Integer> number = new HashMap <>();
        number.put("one",1);
        number.put("two",2);
        number.put("three",3);
        System.out.println(number.put("three",10));
        Set< Map.Entry<String,Integer>> entries = number.entrySet();
        for (Map.Entry<String,Integer> entry: entries){
            entry.setValue(entry.getValue()+100);
        }
        System.out.println(getHash("CAT"));
    }
    public static  int getHash(String s){
        int hash =0;
        for (int i=0;i<s.length();i++){
            hash += s.charAt(i);
            System.out.println(hash);
        }
        return hash;
    }
}
