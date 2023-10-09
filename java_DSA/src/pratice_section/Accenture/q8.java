package pratice_section.Accenture;

import java.util.Arrays;

// chocolates distributions.
public class q8 {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        // {2,3,4,7,9,12,56}
        int m = 3;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0;i+m-1 < arr.length;i++ ){
            int diff = arr[i+m-1] - arr[i];
            min = Math.min(min , diff);
        }
        System.out.println(min);
    }

}
