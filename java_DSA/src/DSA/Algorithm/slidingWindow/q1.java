package DSA.Algorithm.slidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        int len = arr.length;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int j = 0;
        int min = Integer.MAX_VALUE;
        while ( j < len) {
            while (j < k) {
                min = Math.min(min,arr[j]);
                j++;
            }
            if(min < 0) {
                res.add(min);
                min = arr[j];
            }else {
                res.add(0);
            }
            min = Math.min(min,arr[j]);
            j++;
        }
        System.out.println(res);
    }
}
