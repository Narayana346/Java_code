package DSA.Algorithm.mathematics_and_number_theory;

import java.util.Scanner;

//  factorial of s number
public class Q1 {
    static int fact(int n){
        int sum =0;
        if(n==1){
            return 1;
        }else{
         sum = n*fact(n-1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number to find factorial");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n*fact(n-1);
        System.out.println("the factorial of "+n+" is "+sum);
    }
}
