package DSA.Algorithm.Recursion;
// advance recursion -->
//Q ---> find the number of ways in n*m matrix

import java.util.Scanner;

public class Q2 {
   static int way_to_find_destination(int m , int n ){
        if (m==1 || n ==1) return 1 ;
        int res = way_to_find_destination(m-1,n) + way_to_find_destination(m,n-1);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the the row of the matrix --> ");
        int m = sc.nextInt();
        System.out.println("the the column of the matrix --> ");
        int n = sc.nextInt();
        System.out.println("the total way ---> "+ way_to_find_destination(m,n));
    }

}
