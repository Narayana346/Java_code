package pratice_section.Array_QUS;
// tapping water .
public class Q20 {
    public static void main(String[] args) {
        int[] height = {8 ,5 ,2 ,3 ,4 ,7 ,14 ,2 ,2 ,8};
        System.out.println(trap(height));
    }
    public static long trap(int[] h){
        long ans = 0;
        int len = h.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = h[0];
        right[len-1] = h[len - 1];
        for (int i = 1;i < len;i++){
            left[i] = Math.max(left[i - 1], h[i]);
        }
        for (int i = len - 2;i >= 0;i--){
            right[i] = Math.max(right[i + 1], h[i]);
        }
        for (int i = 1;i < len - 1;i++){
            ans += Math.min(left[i], right[i]) - h[i];
        }
        return ans;
    }
}
