package DSA.Algorithm.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Q --> Print all Subset of  a string
public class Q5 {
    public static void sub_string(String str){
        List<String> res = new ArrayList<>();
        res = createSubString(str ,"" , 0);
        for (String item :res){
            System.out.print(item+" ");
        }
    }
    public static List<String> createSubString(String str , String cur , int index){
        ArrayList<String> res = new ArrayList<>();
        if(index == str.length()){
            res.add(cur);
            return res;
        }
        createSubString(str , cur+str.charAt(index) , index+1 );
        createSubString(str , cur, index+1 );
        return res;
    }

    static String swap(String Str , int l ,int r){
        char[] ch = Str.toCharArray();
        char temp = ch[l];
        ch[l] = ch[r];
        ch[r] = temp;
        return String.valueOf(ch);
    }
    static void permute(String s , int l , int r ){
        if ( l == r )
        {
            System.out.print(s+" ");
            return;
        }
        for (int i = l ; i <= r ; i++){
           s =  swap( s , l , i );
            permute(s,l+1,r);
           s =  swap( s, l , i );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String -->");
        String st = sc.nextLine();
        int l = 0;
        int r = st.length()-1;
        permute(st,l,r);
        System.out.println();
        sub_string(st);
    }
}
