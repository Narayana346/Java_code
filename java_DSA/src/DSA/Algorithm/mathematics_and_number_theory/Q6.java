package DSA.Algorithm.mathematics_and_number_theory;

import java.util.Scanner;
// find power using normal method and module method
// rule of the module --->
/* (a+b)%n = (a % n + a % n) % n
/* (a-b)%n = (a % n - a % n) % n
/* (a*b)%n = (a % n * a % n) % n
/* (a/b)%n = (a % n / a % n) % n
* */
public class Q6 {
    static int fastPower(int a , int b ){    //Time complexity O(log n)
       int res = 1;
       while (b>0){
           if ((b&1) != 0 ){
               res = res*a;
           }
           a = a * a;
           b = b >>1 ;
       }
       return res;
    }
    static long fastPower_using_module(long a ,long b ,int n){
        long res = 1;
        while (b>0){
            if ((b&1) != 0 ){
                res = ( res * a % n ) % n ;
            }
            a = ( a % n * a % n ) % n;
            b = b >>1 ;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1 for the power of the small number ---> ");
        System.out.println("enter the 2 for the power of the large number ---> ");
        int number = sc.nextInt();
        switch (number) {
            case 1 :{
                System.out.println("enter the number ---> ");
                int n = sc.nextInt();
                System.out.println("enter the power of the number ---> ");
                int m = sc.nextInt();
                System.out.println("result ---> " + fastPower(n, m));
            }
            case 2 : {
                System.out.println("enter the number ---> ");
                long N = sc.nextLong();
                System.out.println("enter the power of the number ---> ");
                long M = sc.nextLong();
                System.out.println("enter the number to use module --->");
                int l = sc.nextInt();
                System.out.println("result ---> " + fastPower_using_module(N, M, l));
            }
        }
    }
}
