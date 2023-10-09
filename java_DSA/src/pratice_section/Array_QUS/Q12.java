package pratice_section.Array_QUS;
// find sum of 2 num present in arr.
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Arrays.sort(arr);
        System.out.println(findPair(arr));

    }
    public static List<List<Integer>> findPair(int[] arr)
    {
        //You can code here
        List<List<Integer>> whole = new ArrayList<>();
        Arrays.sort(arr);
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int currentSum = arr[i] + arr[j];
                if (seen.contains(currentSum)) {
                    whole.add(Arrays.asList(arr[i], arr[j]));
                }
                seen.add(arr[i]);
                seen.add(arr[j]);
            }
        }


        return whole;
    }

}
