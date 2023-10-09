package pratice_section.Array_QUS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Three sum.
public class Q9 {
    public static void main(String[] args) {
        int arr[] = {-2 ,-1 ,0 ,1 ,2 ,3 ,4};
        int sum = 7;
        List<List<Integer>> ansTwoSum = twoSum(arr,sum,0);
        System.out.println(ansTwoSum);
        List<List<Integer>> ansThreeSum = threeSum(arr);
        System.out.println(ansThreeSum);



    }
    static List<List<Integer>> twoSum(int[] arr ,int sum ,int startForm){
        Arrays.sort(arr);
        int l = startForm;
        int r = arr.length-1;
        List<List<Integer>> ans = new ArrayList<>();
        while (l < r){
            if(l > startForm && arr[l] == arr[l-1]){
                l++;
                continue;
            }
            if (r < arr.length-1 && arr[r] == arr[r+1]){
                r--;
                continue;
            }
            if (arr[l]+arr[r] > sum){
                r--;
            }
            if (arr[l]+arr[r] < sum){
                l++;
            }else {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[l]);
                temp.add(arr[r]);
                ans.add(temp);
                l++;
                r--;
            }
        }

        return ans ;
    }
    static List<List<Integer>> threeSum(int[] nums){
                Arrays.sort(nums);
                List<List<Integer>> result = new ArrayList<>();

                for (int i = 0; i < nums.length - 2; i++) {
                    if (i > 0 && nums[i] == nums[i - 1]) {
                        continue;
                    }
                    int left = i + 1;
                    int right = nums.length - 1;

                    while (left < right) {
                        int total = nums[i] + nums[left] + nums[right];
                        if (total == 0) {
                            result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                            while (left < right && nums[left] == nums[left + 1]) {
                                left++;
                            }
                            while (left < right && nums[right] == nums[right - 1]) {
                                right--;
                            }
                            left++;
                            right--;
                        } else if (total < 0) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }

                return result;
    }
}
