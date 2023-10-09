package DSA.Data_structure.Set_Data_Structure;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(40);
        set.add(30);
        set.add(50);
        set.add(60);
        System.out.println(set);
        set.remove(10);
        System.out.println(set);
        Set<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(40);
        set1.add(30);
        set1.add(50);
        set1.add(60);
        set1.add(20);
        System.out.println(set1);

    }
}
