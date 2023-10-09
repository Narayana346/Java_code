package pratice_section.pattern_question;

public class q3 {
    public static void main(String[] args) {
        int row,col;
        row = 7;col=7;
        for (int i = row;i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = 2;i<=row;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
