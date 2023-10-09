package DSA.Data_structure.Set_Data_Structure.setDataStructure;

import java.util.HashSet;
import java.util.Set;

public class main1 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet <>();
        Set<String> vegetables =new HashSet <>();
        vegetables.add("tomato");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("onion");
        System.out.println(fruits.add("Kiwi"));
        System.out.println(fruits.add("Banana"));
        fruits.addAll(vegetables);
        System.out.println(fruits);
        System.out.println(fruits.containsAll(vegetables));
    }
}
