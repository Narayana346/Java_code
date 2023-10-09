package pratice_section.Array_QUS;
// minimum sum subarray.
public class Q10 {
    public static void main(String[] args) {
        int[] arr = {1,2,6,-1,6,7,2};
        int target = 5;
        System.out.println(minSumSubarray(arr,target));

    }
    public static int minSumSubarray(int[] arr,int target){
        int l = 0 ,r = 0;
        int curSum = 0;
        int minLength = Integer.MAX_VALUE;
        int len = arr.length;
        while (r < len){
            curSum += arr[r];
            while (curSum >= target){
                minLength = Math.min(minLength , r-l+1);
                curSum -= arr[l];
                l++;
            }
            r++;
        }
        if (minLength == Integer.MAX_VALUE){
            minLength = 0 ;
        }
        return minLength;
    }
}
