package pratice_section.Accenture;

import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
       int[] arr = {3,2,1,7,5,4};
       int res = res(arr);
       System.out.println(res);


    }

    public static int res(int[] arr){
        if (arr.length <= 3) return 0;


        int smallestOdd = Integer.MAX_VALUE;
        int secondSmallestOdd = Integer.MAX_VALUE;
        int largestEven = Integer.MIN_VALUE;
        int secondLargestEven = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                // Even position
                if (arr[i] > largestEven) {
                    secondLargestEven = largestEven;
                    largestEven = arr[i];
                } else if (arr[i] > secondLargestEven && arr[i] != largestEven) {
                    secondLargestEven = arr[i];
                }
            } else {
                // Odd position
                if (arr[i] < smallestOdd) {
                    secondSmallestOdd = smallestOdd;
                    smallestOdd = arr[i];
                } else if (arr[i] < secondSmallestOdd && arr[i] != smallestOdd) {
                    secondSmallestOdd = arr[i];
                }
            }
        }

        // Return the sum of the second smallest odd and second largest even
        return secondSmallestOdd + secondLargestEven;

    }
}
