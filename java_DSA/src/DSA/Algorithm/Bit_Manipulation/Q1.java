package DSA.Algorithm.Bit_Manipulation;

import java.util.Scanner;

//find the non repeated number in the array
public class Q1 {
    public static void main(String[] args) {
        System.out.println("enter the number of the element on the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sample = new int[n];
        int res = 0;
        System.out.println("enter the number of the array");
        for (int i = 0;i<sample.length;i++){
            sample[i] =sc.nextInt();
            res = res^sample[i];
        }
        System.out.println("the non repeated number is = "+res);
    }


}
