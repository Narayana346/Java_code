package pratice_section.Array_QUS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 2 Sum problem.
public class Q5 {
    public static void main(String[] args) {
        int[] nums = {-1,-7,-9,-3,-5};
        int[] res = twoSum(nums,-16);
//        Arrays.sort(nums);
        for (int item:res){
            System.out.print(item+" ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int j = 0; j < nums.length; j++) {
            Integer value = map.get(target - nums[j]);
            if(value == null) { /* no match found */
                map.put(nums[j], j);
            }
            else {     /* pair found, updating index */
                arr[0] = value;
                arr[1] = j;
                break; //  loop exit
            }
        }
        return arr;
    }

}
