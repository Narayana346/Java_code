package pratice_section.Accenture;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1 ");
        int num1 = sc.nextInt();
        System.out.println("enter the num2 ");
        int num2 = sc.nextInt();
        int res = sol(num1,num2);
        System.out.println(res);

    }
    public static int sol(int n , int m){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1;i <= n;i++){
            if (i%m == 0 && i >= m){
                sum1 += i;
            }else {
                sum2 += i;
            }
        }
        return sum2 - sum1;
    }
}
