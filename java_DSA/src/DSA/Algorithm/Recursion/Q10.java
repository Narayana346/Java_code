package DSA.Algorithm.Recursion;

import java.util.Collections;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n];
        for (int i =0;i<n;i++){
            res[i] = fibonacci(i);
        }
        for (int Item :
                res) {
            System.out.print(Item+" ");
        }

    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
