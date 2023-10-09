package DSA.Algorithm.Recursion;

import java.util.Scanner;

// is_occurrences on given string
public class Q8 {
    public static int is_occurrence( String text , String word , int index){
        if(index > text.length()-word.length()){
            return 0;
        }
        boolean check = text.substring(index , index+word.length()).equals(word);
        int ans =  is_occurrence(  text ,  word ,  index+1);
        if(check) return ans+1;
        else return ans;
    }
    public static int count_occurrence(String text , String word){
        return is_occurrence(text,word,0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main String ");
        String text = sc.nextLine();
        System.out.println("Enter the word in is_occurrence");
        String word = sc.nextLine();
        System.out.println(count_occurrence(text,word));

    }
}
