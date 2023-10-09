package pratice_section.Array_QUS;
// contains 123 given integer.
import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        int[] arr = {321, 123, 89, 32, 11,95874};
        Arrays.sort(arr);
        System.out.println(find123Digits(arr, args.length));
    }
    public static List<Integer> find123Digits(int[] arr, int n) {
        List<Integer> ans = new ArrayList<>();
        for (int item : arr) {
            if (helper(item)) {
                ans.add(item);
            }
        }
        if (ans.isEmpty()) {
            ans.add(-1);
        }
        return ans;
    }
    public static boolean helper(int num){
        if (num < 100 ) return false;
        while (num>0){
            int rim = num % 10;
            if (rim <= 0 || rim > 3) return false;
            num = num / 10;
        }
        return true;
    }
}
