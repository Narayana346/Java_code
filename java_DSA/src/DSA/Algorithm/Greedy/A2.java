package DSA.Algorithm.Greedy;

public class A2 {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.print(maxContainWater(arr));
    }
    private static int maxContainWater(int[] arr){
        int maxArea = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int currentArea = Math.min(arr[start], arr[end]) * (end-start);
            maxArea = Math.max(currentArea,maxArea);
            if (arr[start] < arr[end]) {
                start++;
            }else {
                end--;
            }
        }
        return maxArea;
    }
}
