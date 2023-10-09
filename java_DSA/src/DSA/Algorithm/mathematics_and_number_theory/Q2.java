package DSA.Algorithm.mathematics_and_number_theory;

import java.util.Scanner;

// find the trailing zero in factorials
public class Q2 {
    public static void main(String[] args) {
        System.out.println("enter the number to find factorial ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for ( int i=5;i<=n;i=i*5){
            res = res+n/i;
        }
        System.out.println("the factorial of trailing Zero is "+res);
    }
}
