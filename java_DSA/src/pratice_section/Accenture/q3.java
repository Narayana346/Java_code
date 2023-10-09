package pratice_section.Accenture;

import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        String str = "striing";
        String str2 = "ginrtss";
        String res = angrams(str,str2);
        System.out.println(res);

    }
    public static String angrams(String str , String str2){
        if (str.length() != str2.length()) return "No";
        char st[] = str.toCharArray();
        char st2[] = str2.toCharArray();
        Arrays.sort(st);
        Arrays.sort(st2);
        for (int i = 0 ;i<str.length();i++){
            if (st[i] != st2[i]){
                return "No";
            }
        }
        return "Yes";
    }
}
