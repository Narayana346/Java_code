package pratice_section.Array_QUS;
// maximum profit making stock .
public class Q15 {
    public static void main(String[] args) {
        int[] prices ={10, 19, 1, 30, 32};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int item : prices){
           min = Math.min(min ,item);
           max = Math.max(max , item-min);
        }
        System.out.println(max);

    }
}
