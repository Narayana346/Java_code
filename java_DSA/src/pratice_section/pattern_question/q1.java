package pratice_section.pattern_question;

public class q1 {
    public static void main(String[] args) {
        int row,col;
        row = 7;col=7;
        for (int i = 1;i<=row;i++){
            for (int j = col;j>i;j--){
                System.out.print(1+" ");
            }
            for (int j = 1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
