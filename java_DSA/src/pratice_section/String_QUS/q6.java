package pratice_section.String_QUS;
// find first non-repeating character in given string
public class q6 {
    public static void main(String[] args) {
        String str = "abcdafb";
        System.out.println(nonRepeatingFirstChar(str));

    }
    static int nonRepeatingFirstChar(String str) {
        int[] occur = new int[26];
        for(int i = 0;i<str.length();i++) {
            occur[ str.charAt(i)-'a']+= 1;
        }
        for(int i = 0;i<str.length();i++) {
            if(occur[ str.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
