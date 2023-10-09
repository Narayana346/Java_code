package pratice_section.Array_QUS;
// sum of min max .
public class Q6 {
    public static void main(String[] args) {
        int[] nums = new int[]{-10, 2, 4, 5, 6};
        System.out.println(sumMaxMin(nums));
    }
    public static long sumMaxMin(int[] nums){
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int item : nums){
            if (item > max){
                max = item;
            }
            if (item<min){
                min = item;
            }
        }
        return (min+max);
    }
}
