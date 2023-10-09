package DSA.Algorithm.mathematics_and_number_theory;

import java.util.Scanner;

// palindrome number
public class Q3 {
    public static void main(String[] args) {
        System.out.println("enter the number to find factorial ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        int sum =0;
        int res;
        while (n>0){
            res = n%10;
            sum = (sum*10)+res;
            n= n/10;
        }
        if (temp == sum){
            System.out.println("number is palindrome");
        }else System.out.println("number is not palindrome");
    }
}
