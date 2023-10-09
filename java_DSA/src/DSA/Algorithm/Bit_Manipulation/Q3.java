package DSA.Algorithm.Bit_Manipulation;

import java.util.Scanner;
//find the non repeated number on the array on 'k' time repeated number;
public class Q3 {
    static int find_unique(int[]a,int n, int k){
        byte sizeof_int = 4;
        int int_size = 8*sizeof_int;
        int[] count = new int[int_size];
        for (int i =0;i<int_size;i++){
            for (int j =0;j<n;j++){
                if ((a[j]&(1<<i))!=0){
                    count[i] += 1;
                }
            }
        }
        int res = 0;
        for (int i = 0;i<int_size;i++){
            res += (count[i]%k)*(1<<i);
        }
       return res;
    }
    public static void main(String[] args) {
        System.out.println("enter the number of the element on the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sample = new int[n];
        System.out.println("enter the number of the array");
        for (int i = 0;i<sample.length;i++){
            sample[i] =sc.nextInt();
        }
        int n2 = sample.length;
        int k = 3;
        System.out.println("the non repeated number is "+find_unique(sample,n2,k));

    }
}
