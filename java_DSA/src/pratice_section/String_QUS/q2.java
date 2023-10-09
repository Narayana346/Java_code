package pratice_section.String_QUS;

public class q2 {
    public static void main(String[] args) {
        String[] que ={"hllo","hlp","hlkel"};
        String check = que[0];
        for (String item : que) {
            check = comseq(item,check);
        }
        System.out.println(check);
    }
    public static String comseq(String str1 ,String str2){
        int n = str1.length();
        int m = str2.length();
        String res = "";
        for (int i = 0, j = 0;i<n && j<m;i++,j++){
            if(str1.charAt(i) != str2.charAt(j)){
                break;
            }
            res += str1.charAt(i);

        }
        return res;
    }
}
