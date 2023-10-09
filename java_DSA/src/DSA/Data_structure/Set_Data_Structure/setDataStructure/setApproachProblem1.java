package DSA.Data_structure.Set_Data_Structure.setDataStructure;
//sub array sum of zero in set approach
import java.util.HashSet;
import java.util.Set;

public class setApproachProblem1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet <>();
        int []array = {2,-1,3,-4,2};
        int sum = 0;
        boolean found = false;
        for (int element : array){
            set.add(sum);
            sum = sum+element;
            if (set.contains(sum)){
                found = true;
                break;
            }
        }
        System.out.println("Found - "+found);
    }
}
