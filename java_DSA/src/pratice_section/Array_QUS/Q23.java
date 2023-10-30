package pratice_section.Array_QUS;
import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binaryArray = new int[n];
        for(int i=0;i<n;i++){
            binaryArray[i] = sc.nextInt();
        }
        System.out.println(findMaxLen(binaryArray));
        sc.close();
    }
    public static int findMaxLen(int[] nums){
        int maxLength = 0;
        int sum = 0;
        HashMap<Integer,Integer> sumToIndex = new HashMap<Integer,Integer>();
        sumToIndex.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                sum--;
            }else {
                sum++;
            }
            if(sumToIndex.containsKey(sum)){
                maxLength = Math.max(maxLength,i-sumToIndex.get(sum));
            }else{
                sumToIndex.put(sum,i);
            }
        }
        return maxLength;
    }
}
