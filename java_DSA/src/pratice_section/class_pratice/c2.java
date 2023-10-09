package pratice_section.class_pratice;

import java.util.ArrayList;
import java.util.HashSet;

public class c2 {
    public static void main(String[] args) {
        System.out.println("Date 8/8/2023");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(5);
        arr.add(3);
        arr.add(3);
        arr.add(54);
        arr.add(54);
        arr.add(7);
        System.out.println(arr);
        HashSet<Integer> res = new HashSet<>();
        for (Integer item :
                arr) {
            res.add(item);
        }
        System.out.println(res);



    }
}
