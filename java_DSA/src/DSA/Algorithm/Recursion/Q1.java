package DSA.Algorithm.Recursion;
/* Recursion in  3 step -->
* find the base case
* find the relation between the problem and sub problems
* generalise the relation
   */

import java.util.Scanner;

public class  Q1 {

    //Q --> calculate a power of b using recursion -->
  static int find_power(int a ,int b ){
      if (b==0) return 1;
      int res = find_power(a,b-1)*a;
      return res;
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the power --> ");
        int a =sc.nextInt();
        System.out.println("Enter the number to power of the number  --> ");
        int b = sc.nextInt();
        System.out.println("the power is --> "+find_power(a,b));
    }
}
