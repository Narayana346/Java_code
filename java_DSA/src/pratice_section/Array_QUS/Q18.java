package pratice_section.Array_QUS;

import java.util.Arrays;

//
public class Q18 {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 5, 2,0, 9, 10, 3, 6, 6};
        countSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] > max) {
                max = arr[i] - arr[i-1];
            }
        }
        System.out.println(max);

    }
    public static void countSort(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int item :
                arr) {
            max = Math.max(max,item);
        }
        int[] count = new int[max+1];
        for (int item :
                arr) {
            count[item]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[j++] = i;
            }
        }

    }
}
