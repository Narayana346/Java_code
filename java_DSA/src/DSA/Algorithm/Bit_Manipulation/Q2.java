package DSA.Algorithm.Bit_Manipulation;
//find two non repeated number on array
import java.util.Scanner;

public class Q2 {
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
        int sum1 = 0;
        int sum2 = 0;
        res = res&-res;//imp
        for (int j : sample) {
            if ((j & res) > 0) {
                sum1 = sum1 ^ j;//imp
            } else {
                sum2 = sum2 ^ j;//imp
            }
        }
        System.out.println("the two non repeated number is "+sum1+" and "+sum2);
    }
}
