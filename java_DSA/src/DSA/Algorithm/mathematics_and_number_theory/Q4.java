package DSA.Algorithm.mathematics_and_number_theory;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//imp --->   using  **** sieve of Eratosthenes Algo ****
// Q ---> find prime number
public class Q4 {
    static boolean[]  sieve_of_Eratosthenes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i  = 2 ; i <= n ; i++){
            for (int j = 2*i ; j<=n; j+=i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {

        System.out.println("enter the number of the limit of the prime number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrime = sieve_of_Eratosthenes(n);
        System.out.println("false ---> not prime");
        System.out.println("true --->  prime");

        for(int i = 0;i<=n;i++){
            System.out.println(i+" "+isPrime[i]);
        }
    }
}
