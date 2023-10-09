package pratice_section.pattern_question;

public class q5 {
    public static void main(String[] args) {
        int row,count;
        row = 7;
        for (int i = 1;i<=row;i++){
            count=7;
            for (int j = 1;j<=i;j++){
                System.out.print(count+" ");
                count--;
            }
            System.out.println();
        }
    }
}
