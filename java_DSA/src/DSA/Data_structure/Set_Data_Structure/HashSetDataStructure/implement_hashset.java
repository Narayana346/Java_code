package DSA.Data_structure.Set_Data_Structure.HashSetDataStructure;

import java.util.HashSet;
import java.util.Iterator;

public class implement_hashset {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(10);
        System.out.println(s);
        Iterator itr = s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        if (s.contains(10)){
            System.out.println("present");
        }else {
            System.out.println("Not_prsent");
        }
        s.remove(10);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
    }
}
