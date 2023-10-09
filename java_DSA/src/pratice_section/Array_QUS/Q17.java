package pratice_section.Array_QUS;

import java.util.Scanner;

// generate spiral matrix:-
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] ans = spiralMatrix(num);
        for (int[] item : ans){
            for (int ele : item){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    public static int[][] spiralMatrix(int N){
                if (N <= 0) {
                    return new int[0][0];
                }

                int[][] matrix = new int[N][N];
                int num = 1;
                int left = 0, right = N - 1, top = 0, bottom = N - 1;

                while (left <= right && top <= bottom) {
                    // Traverse from left to right at the top row
                    for (int i = left; i <= right; i++) {
                        matrix[top][i] = num++;
                    }
                    top++;

                    // Traverse from top to bottom at the rightmost column
                    for (int i = top; i <= bottom; i++) {
                        matrix[i][right] = num++;
                    }
                    right--;

                    // Traverse from right to left at the bottom row
                    for (int i = right; i >= left; i--) {
                        matrix[bottom][i] = num++;
                    }
                    bottom--;

                    // Traverse from bottom to top at the leftmost column
                    for (int i = bottom; i >= top; i--) {
                        matrix[i][left] = num++;
                    }
                    left++;
                }

                return matrix;
    }
}
