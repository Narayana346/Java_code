package pratice_section.pattern_question;

public class q9 {
    public static void main(String[] args) {
        int row = 7;
        for (int i = 1;i<=row;i++){
            for (int j = 1;j<i;j++){
                System.out.print("  ");
            }
            for (int j = i;j<=row;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = row-1;i>=1;i--){
            for (int j = 1;j<i;j++){
                System.out.print("  ");
            }
            for (int j = i;j<=row;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
