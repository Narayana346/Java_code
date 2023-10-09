package pratice_section.pattern_question;

public class q13 {
    public static void main(String[] args) {
        int row = 7;
        for (int i = 0;i<row;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(0);
            }
            System.out.print(i);
            for (int j = row-1;j>i;j--) {
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
