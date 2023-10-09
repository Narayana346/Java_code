package pratice_section.class_pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class c4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr.add(5);
        arr.add(5);
        arr.add(3);
        arr.add(6);
        arr.add(3);
        arr.add(54);
        arr.add(54);
        arr.add(7);
        Collections.sort(arr);
        System.out.print(arr);
        System.out.println();
        for (Integer item :
                arr) {
            if(item%2 == 0){
                System.out.print(item+" ");
            }
        }
        System.out.println();
        System.out.println(arr);
        TreeSet<Integer> res = new TreeSet<>();
        for (Integer item :
                arr) {
            res.add(item);
        }

        for (Integer item :
                res) {
            arr1.add(item);
        }
        System.out.print(arr1.get(arr1.size()-1));

    }
}
