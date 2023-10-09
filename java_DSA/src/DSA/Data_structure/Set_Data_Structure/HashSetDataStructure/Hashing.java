package DSA.Data_structure.Set_Data_Structure.HashSetDataStructure;

import java.util.HashSet;
import java.util.Set;

// in Hashing technique # insert , search , delete functionality occurred the time complexity is O(1) .
//Q --> intersection of the two set .
public class Hashing {
    static int intersect(int[] arr1 , int[] arr2 ){
        Set<Integer> set = new HashSet <>();
        int count = 0;
        for (int item : arr1) {
            set.add(item);
        }
        for (int item :
                arr2) {
            if (set.contains(item)) {
                count++;
                System.out.print(item+" ");
                set.remove(item);
            }
        }
        System.out.println();
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {5,10,15,5,10};
        int[] arr2 = {15,5,5,10,4};
        System.out.println("the size of the intersection element is "+intersect( arr1,arr2));

        
    }
}
