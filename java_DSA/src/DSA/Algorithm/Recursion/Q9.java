package DSA.Algorithm.Recursion;

import java.util.*;

public class Q9 {
//    public static void findSubstrings(String s) {
//        //You can code here
//        List<String> res = new ArrayList<>();
//        createSubString(s,"",0);
//        for (String item :
//                res) {
//            System.out.print(item+" ");
//        }
//    }
    public static void createSubString(String str , String cur , int index){
        ArrayList<String> res = new ArrayList<>();
        if(index == str.length()){
            System.out.print(cur+" ");
            return ;
        }
        createSubString(str , cur+str.charAt(index) , index+1 );
        createSubString(str , cur, index+1 );

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        createSubString(str ,"",0);
    }
}
