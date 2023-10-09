package DSA.Algorithm.Recursion;

import java.util.Scanner;

// find the palindrome String
public class Q4 {
    static boolean is_Palindrome(String str, int l , int r ){
        if ( l >= r ) return true;
        if ( str.charAt(r) != str.charAt(l) ) return false;
        return (is_Palindrome(str,l+1,r-1));      // -----> O(N)
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String -->");
        String st = sc.nextLine();

        int l = 0;
        int r = st.length()-1;
        System.out.print("the String is palindrome ---> "+ is_Palindrome(st,l,r));
    }
}
