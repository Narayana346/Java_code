package DSA.Algorithm.mathematics_and_number_theory;

import java.util.Scanner;

// ***** GCD ****
// ROLE ---> GCD(a,b) = GCD(a-b , b ) where a > b
// ROLE ---> GCD(a,b) = GCD( b , a % b ) where a % b! = 0
// Q ---> find GCD
public class Q5 {
    static int find_GCD(int a , int b ){
        if (b==0)return a;
        return find_GCD(b,a % b);
    }
    public static int calcGCD(int a, int b){
        while(a>0 && b>0){
            if(a>b) {a = a%b;}
            else b = b%a;
        }
        if(a == 0) return b;
        else return a;
    }

    public static void main(String[] args) {
        System.out.println("enter the number to find GCD ---> ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        System.out.println("GCD ----> "+find_GCD(n,m));
        System.out.println("GCD ----> "+calcGCD(n,m));
    }
}
