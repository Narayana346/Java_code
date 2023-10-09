package DSA.Algorithm.Recursion;

import java.util.Scanner;
//***   Josephus algorithm    ***

//Q --> Josephus problem
public class Q3 {
    static int find_alive_person(int n , int k){
        if (n==0) return  0;
        return (find_alive_person(n-1,k)+k) % n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the person --> ");
        int n =sc.nextInt();
        System.out.println("enter the number for shifting the gun  --> ");
       int k = sc.nextInt();
       System.out.println("the survival person is "+find_alive_person(n,k));
    }
}
 